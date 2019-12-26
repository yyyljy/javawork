package jdbc.board.exam;

import java.util.Scanner;

import jdbc.basic.PreparedDeleteTest;
import jdbc.basic.PreparedInsertTest;
import jdbc.basic.PreparedSelectTest;
import jdbc.basic.PreparedUpdateTest;

public class BoardDAOTest {
	public static void main(String[] args) {
		final int INSERT = 1;
		final int UPDATE = 2;
		final int DELETE = 3;
		final int SELECT = 4;
		System.out.println("***** 메뉴 선택 *****");
		System.out.println("1.Insert(게시글 등록)");
		System.out.println("2.Update(게시글 ID변경)");
		System.out.println("3.Delete(게시글 삭제)");
		System.out.println("4.Select(게시글 조회)");
		System.out.print("** 메뉴 선택 : ");
		Scanner key = new Scanner(System.in);
		int menu = key.nextInt();
		switch(menu) {
			case INSERT:
				
			case UPDATE:
				
			case DELETE:
				
			case SELECT:
				
			default:
				System.out.println("잘못된 메뉴 선택입니다.");
					
		}
		
	}
	//insert
/*	public static void main(String[] args) {
		BoardDAO dao =new BoardDAO();
		Scanner key = new Scanner(System.in);
		System.out.println("*****게시글 등록******");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("제목:");
		String title = key.next();
		System.out.print("내용:");
		String content = key.next();
		dao.insert(id,title,content);
	}*/
	//update
	/*public static void main(String[] args) {
		PreparedUpdateTest obj = new PreparedUpdateTest();
		Scanner key = new Scanner(System.in);
		System.out.println("*****id 변경******");
		System.out.print("변경후 id:");
		String id = key.next();
		System.out.print("변경할 대상의 boardnum:");
		int boardnum = key.nextInt();
		obj.update(id, boardnum);
	}*/
	//delete
/*	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("*****게시글 삭제******");
		System.out.print("삭제할 boardnum:");
		int boardnum = key.nextInt();
		PreparedDeleteTest obj = new PreparedDeleteTest();
		obj.delete(boardnum);
	}*/
	//select
	/*public static void main(String[] args) {
		PreparedSelectTest obj = new PreparedSelectTest();
		obj.select();
	}*/
}
