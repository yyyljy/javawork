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
public class PreparedDeleteTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("삭제할 boardnum:");
		int boardnum = key.nextInt();
		PreparedDeleteTest obj = new PreparedDeleteTest();
		obj.delete(boardnum);
	}
	public void delete(int boardnum) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		Connection con = null;
		PreparedStatement ptmt = null;
		String sql = "delete tb_board where boardnum = ?";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
			ptmt = con.prepareStatement(sql);
			ptmt.setInt(1, boardnum);
			int result = ptmt.executeUpdate();
			System.out.println(result+"개 행이 삭제됐습니다.");
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
