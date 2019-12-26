package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedInsertTest {
	public static void main(String[] args) {
		PreparedInsertTest obj =new PreparedInsertTest();
		Scanner key = new Scanner(System.in);
		System.out.println("*****게시글 등록******");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("제목:");
		String title = key.next();
		System.out.print("내용:");
		String content = key.next();
		obj.insert(id,title,content);
	}
	public void insert(String id, String title, String content) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		//String url = "jdbc:oracle:thin:@70.12.115.61:1521:xe";
		String user = "scott";
		String password = "tiger";
		Connection con = null;
		PreparedStatement ptmt = null;
		String sql = "insert into tb_board values(board_seq.nextval,?,?,?,sysdate,0)";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, id);
			ptmt.setString(2, title);
			ptmt.setString(3, content);
			int result = ptmt.executeUpdate();
			System.out.println(result + "개 행 삽입성공");

		}catch(ClassNotFoundException e) {
			System.out.println("드라이버연결 실패!!");
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
