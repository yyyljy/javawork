package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//1. ���� �ڵ�
//2. 2�� boardnum�� id�� kang���� ����
//3. [�������] 1�� ���� �����ƽ��ϴ�.
//4. �Ϸ��� DeleteTest.java�� rename �۾�
//4-1. sql���� delete�� ����
//4-2. 3�� boardnum�� �Խù��� ����
//4-3. [�������] 1�� ���� ���� �ƽ��ϴ�.
public class UpdateTest {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "update tb_board set id=('kang') where boardnum = 2";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����");
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("���� ����");
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
			System.out.println(result+"�� ���� �����ƽ��ϴ�.");
		}catch(ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����!");
		}catch(SQLException e) {
			System.out.println("���� ����:"+e.getMessage());
			e.printStackTrace();
		}
	}
}
