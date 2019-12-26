package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

//1. 직접 코딩
//2. 2번 boardnum의 id를 kang으로 수정
//3. [출력형태] 1개 행이 수정됐습니다.
//4. 완료후 DeleteTest.java로 rename 작업
//4-1. sql문만 delete로 변경
//4-2. 3번 boardnum의 게시물을 삭제
//4-3. [출력형태] 1개 행이 삭제 됐습니다.
public class PreparedUpdateTest {
	public static void main(String[] args) {
		PreparedUpdateTest obj = new PreparedUpdateTest();
		Scanner key = new Scanner(System.in);
		System.out.print("변경후 id:");
		String id = key.next();
		System.out.print("변경할 대상의 boardnum:");
		int boardnum = key.nextInt();
		obj.update(id, boardnum);
	}
	public void update(String id, int boardnum) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		Connection con = null;
		PreparedStatement ptmt = null;
		String sql = "update tb_board set id=? where boardnum = ?";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, id);
			ptmt.setInt(2, boardnum);
			int result = ptmt.executeUpdate();
			System.out.println(result+"개 행이 수정됐습니다.");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(ptmt!=null)ptmt.close();
				if(con!=null)con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
