package jdbc.board.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//DBMS�� �����ϴ� �ߺ��� �۾��� ������ Ŭ����
public class DBUtil {
	//����̹��ε��� Ŭ������ �ε��ɶ� ���� �ε��ǵ��� ó��
	//==>static{}�ȿ� ��ɹ��� Ŭ������ �ε��ɶ� �ѹ��� ����Ǵ� �ڵ�
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//2. Ŀ�ؼ��ϱ� 
	public static Connection getConnect() {
		Connection con = null;
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		try {
			con = DriverManager.getConnection(url, user, password);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
