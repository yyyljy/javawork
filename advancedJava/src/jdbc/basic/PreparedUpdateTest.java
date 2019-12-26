package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

//1. ���� �ڵ�
//2. 2�� boardnum�� id�� kang���� ����
//3. [�������] 1�� ���� �����ƽ��ϴ�.
//4. �Ϸ��� DeleteTest.java�� rename �۾�
//4-1. sql���� delete�� ����
//4-2. 3�� boardnum�� �Խù��� ����
//4-3. [�������] 1�� ���� ���� �ƽ��ϴ�.
public class PreparedUpdateTest {
	public static void main(String[] args) {
		PreparedUpdateTest obj = new PreparedUpdateTest();
		Scanner key = new Scanner(System.in);
		System.out.print("������ id:");
		String id = key.next();
		System.out.print("������ ����� boardnum:");
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
			System.out.println(result+"�� ���� �����ƽ��ϴ�.");
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
