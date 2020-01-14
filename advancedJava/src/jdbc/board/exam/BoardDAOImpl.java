package jdbc.board.exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

//tb_board테이블을 엑세스하는 기능이 정의된 클래스
public class BoardDAOImpl implements BoardDAO{
	public int insert(BoardDTO board) {
		System.out.println(board);
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		String sql = "insert into tb_board values(board_seq.nextval,?,?,?,sysdate,0)";
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, board.getId());
			ptmt.setString(2, board.getTitle());
			ptmt.setString(3, board.getContent());
			result = ptmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, ptmt, con);
		}
		return result;
	}
	public int insert(String id, String title, String content) {
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		String sql = "insert into tb_board values(board_seq.nextval,?,?,?,sysdate,0)";
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, id);
			ptmt.setString(2, title);
			ptmt.setString(3, content);
			result = ptmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, ptmt, con);
		}
		return result;
	}
	public int update(String id, int boardnum) {
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		String sql = "update tb_board set id=? where boardnum = ?";
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, id);
			ptmt.setInt(2, boardnum);
			result = ptmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, ptmt, con);
		}
		return result;
	}
	public int delete(int boardnum) {
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		String sql = "delete tb_board where boardnum = ?";
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setInt(1, boardnum);
			result = ptmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, ptmt, con);
		}
		return result;
	}
	public ArrayList<BoardDTO> select() {
		ArrayList<BoardDTO> boardlist = new ArrayList<BoardDTO>();
		//조회한 게시글을 담을 객체
		//객체를 생성하지않고 null로 초기화 하는 이유
		//->데이터를 조회하는 작업을 하는 곳이 while문 내부이므로
		String sql = "select * from tb_board";
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		BoardDTO board = null;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			while(rs.next()) {
				board = new BoardDTO(rs.getInt(1),rs.getString(2),
									rs.getString(3),rs.getString(4),
									rs.getDate(5),rs.getInt(6));
				boardlist.add(board);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, ptmt, con);
		}
		return boardlist;
	}
	public ArrayList<BoardDTO> findByTitle(String title) {
		ArrayList<BoardDTO> boardlist = new ArrayList<BoardDTO>();
		BoardDTO board = null;
		String sql = "select * from tb_board where title like ?";
		title = "%"+title+"%";
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, title);
			rs = ptmt.executeQuery();
			while(rs.next()) {
				board = new BoardDTO(rs.getInt(1),rs.getString(2),
						rs.getString(3),rs.getString(4),
						rs.getDate(5),rs.getInt(6));
				boardlist.add(board);				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, ptmt, con);
		}
		return boardlist;
	}
	public BoardDTO read(int boardnum) {
		BoardDTO board = null;
		String sql = "select * from tb_board where boardnum = ?";
		Connection con = null;
		PreparedStatement ptmt = null;
		PreparedStatement ptmt1 = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setInt(1, boardnum);
			rs = ptmt.executeQuery();
			rs.next();
			board = new BoardDTO(rs.getInt(1),rs.getString(2),
					rs.getString(3),rs.getString(4),
					rs.getDate(5),rs.getInt(6)+1);
			sql = "update tb_board set hit=hit+1 where boardnum = ?";
			ptmt1 = con.prepareStatement(sql);
			ptmt1.setInt(1, boardnum);
			ptmt1.executeQuery();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, ptmt1, null);
			DBUtil.close(rs, ptmt, con);
		}
		return board;
	}
}
