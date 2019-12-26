package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//1. 직접 코딩
//2. 2번 boardnum의 id를 kang으로 수정
//3. [출력형태] 1개 행이 수정됐습니다.
//4. 완료후 DeleteTest.java로 rename 작업
//4-1. sql문만 delete로 변경
//4-2. 3번 boardnum의 게시물을 삭제
//4-3. [출력형태] 1개 행이 삭제 됐습니다.
public class UpdateTest {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "update tb_board set id=('kang') where boardnum = 2";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("연결 성공");
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
			System.out.println(result+"개 행이 수정됐습니다.");
		}catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패!");
		}catch(SQLException e) {
			System.out.println("연결 실패:"+e.getMessage());
			e.printStackTrace();
		}
	}
}
