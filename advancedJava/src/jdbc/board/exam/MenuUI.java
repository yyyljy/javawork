package jdbc.board.exam;
import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	BoardDAO dao = new BoardDAOImpl();
	public void insertMenu(){
		System.out.println("*******�Խñ۵��********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("����:");
		String title = key.next();
		System.out.print("����:");
		String content = key.next();
		//���⿡�� BoardDAO�� �޼ҵ带 ȣ���ϼ���
		//int result = dao.insert(id, title, content);
		BoardDTO board = new BoardDTO(id,title,content);
		int result = dao.insert(board);
		if(result>0) {
			System.out.println("�Խñ� ��� ����");
		}else {
			System.out.println("�� ��� ����");
		}
	}
	public void updateMenu(){
		System.out.println("*******�Խñۼ���********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�Խñ۹�ȣ:");
		int boardNum = key.nextInt();
		//���⿡�� BoardDAO�� �޼ҵ带 ȣ���ϼ���
		int result = dao.update(id, boardNum);
		if(result>0) {
			System.out.println("�Խñ� ���� ����");
		}else {
			System.out.println("�� ���� ����");
		}
	}
	public void deleteMenu(){
		System.out.println("*******�Խñۻ���********");
		System.out.print("�Խñ۹�ȣ:");
		int boardNum = key.nextInt();
		//���⿡�� BoardDAO�� �޼ҵ带 ȣ���ϼ���
		int result = dao.delete(boardNum);
		if(result>0) {
			System.out.println("�Խñ� ���� ����");
		}else {
			System.out.println("�� ���� ����");
		}
	}
	public void searchMenu(){
		System.out.println("*******�Խñ۰˻�********");
		System.out.print("����:");
		String title = key.next();
		//���⿡�� BoardDAO�� �޼ҵ带 ȣ���ϼ���
		dao.search(title);
	}
	
	
	public void selectMenu(){
		System.out.println("*******�Խñ���ȸ********");
		//���⿡�� BoardDAO�� �޼ҵ带 ȣ���ϼ��� - ��ü�����ȸ
		dao.select();
	}
}


















