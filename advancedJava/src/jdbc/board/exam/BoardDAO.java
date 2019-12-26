package jdbc.board.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//tb_board테이블을 엑세스하는 기능이 정의된 클래스
public class BoardDAO {
	public void insert(String id, String title, String content) {
		Connection con = null;
		PreparedStatement ptmt = null;
		String sql = "insert into tb_board values(board_seq.nextval,?,?,?,sysdate,0)";
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, id);
			ptmt.setString(2, title);
			ptmt.setString(3, content);
			int result = ptmt.executeUpdate();
			System.out.println(result + "개 행 삽입성공");

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
	public void update(String id, int boardnum) {
		Connection con = null;
		PreparedStatement ptmt = null;
		String sql = "update tb_board set id=? where boardnum = ?";
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, id);
			ptmt.setInt(2, boardnum);
			int result = ptmt.executeUpdate();
			System.out.println(result+"개 행이 수정됐습니다.");
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
	public void delete(int boardnum) {
		Connection con = null;
		PreparedStatement ptmt = null;
		String sql = "delete tb_board where boardnum = ?";
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setInt(1, boardnum);
			int result = ptmt.executeUpdate();
			System.out.println(result+"개 행이 삭제됐습니다.");
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
	public void select() {
		String sql = "select * from tb_board";
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString("content")+"\t");
				System.out.print(rs.getDate(5)+"\t");
				System.out.println(rs.getInt(6));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(ptmt!=null)ptmt.close();
				if(con!=null)con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
