package exam.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/*
ID
PASS
NAME
REGDATE
POINT
ADDR
*/
/*
 * public int insert(CustomerDTO customer) : CustomerDTO의 값을 insert할 수 있도록 구현하기
 * public int update(String id, String addr) : 입력받은 id가 일치하는 데이터의 addr수정하기
 * public int delete(String id) : 입력받은 id가 일치하는 데이터 삭제하기
*/
public class CustomerDAO {
	public int insert(CustomerDTO customer) {
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		String sql = "insert into customer values(?,?,?,sysdate,?,?)";
		try {
			con = DBUtil.getconnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, customer.getId());
			ptmt.setString(2, customer.getPass());
			ptmt.setString(3, customer.getName());
			ptmt.setInt(4, customer.getPoint());
			ptmt.setString(5, customer.getId());
			result = ptmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null,ptmt,con);
		}
		return result;
	}
	public int update(String id, String addr) {
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		String sql = "update customer set addr = ? where id = ?";
		try {
			con = DBUtil.getconnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, addr);
			ptmt.setString(2, id);
			result = ptmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null,ptmt,con);
		}
		return result;
	}
	public int delete(String id) {
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		String sql = "delete customer where id = ?";
		try {
			con = DBUtil.getconnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, id);
			result = ptmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null,ptmt,con);
		}
		return result;
	}
}
