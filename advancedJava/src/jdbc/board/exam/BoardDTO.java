package jdbc.board.exam;

import java.util.Date;

public class BoardDTO {
	private int boardNum;	//BOARDNUM
	private String id;		//ID
	private String title;	//TITLE
	private String content;//CONTENT
	private Date writeDate;//WRITE_DATE
	private int hit;		//HIT
	 
	public BoardDTO() {
		super();
	}
	// insert¿ë
	public BoardDTO(String id, String title, String content) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
	}
	//select¿ë
	public BoardDTO(int boardNum, String id, String title, String content, Date writeDate, int hit) {
		super();
		this.boardNum = boardNum;
		this.id = id;
		this.title = title;
		this.content = content;
		this.writeDate = writeDate;
		this.hit = hit;
	}
	public int getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	@Override
	public String toString() {
		return "BoardDTO [boardNum=" + boardNum + ", id=" + id + ", title=" + title + ", content=" + content
				+ ", writeDate=" + writeDate + ", hit=" + hit + "]";
	}
	
	 
	 
}
