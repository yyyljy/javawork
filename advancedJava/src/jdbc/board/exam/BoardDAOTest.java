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
		System.out.println("***** �޴� ���� *****");
		System.out.println("1.Insert(�Խñ� ���)");
		System.out.println("2.Update(�Խñ� ID����)");
		System.out.println("3.Delete(�Խñ� ����)");
		System.out.println("4.Select(�Խñ� ��ȸ)");
		System.out.print("** �޴� ���� : ");
		Scanner key = new Scanner(System.in);
		int menu = key.nextInt();
		switch(menu) {
			case INSERT:
				
			case UPDATE:
				
			case DELETE:
				
			case SELECT:
				
			default:
				System.out.println("�߸��� �޴� �����Դϴ�.");
					
		}
		
	}
	//insert
/*	public static void main(String[] args) {
		BoardDAO dao =new BoardDAO();
		Scanner key = new Scanner(System.in);
		System.out.println("*****�Խñ� ���******");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("����:");
		String title = key.next();
		System.out.print("����:");
		String content = key.next();
		dao.insert(id,title,content);
	}*/
	//update
	/*public static void main(String[] args) {
		PreparedUpdateTest obj = new PreparedUpdateTest();
		Scanner key = new Scanner(System.in);
		System.out.println("*****id ����******");
		System.out.print("������ id:");
		String id = key.next();
		System.out.print("������ ����� boardnum:");
		int boardnum = key.nextInt();
		obj.update(id, boardnum);
	}*/
	//delete
/*	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("*****�Խñ� ����******");
		System.out.print("������ boardnum:");
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
