package jdbc.board.exam;
import java.util.ArrayList;
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
		ArrayList<BoardDTO> boardlist = dao.findByTitle(title);
		int size = boardlist.size();
		for(int i=0;i<size;i++) {
			BoardDTO board = boardlist.get(i);
			System.out.println(board.getBoardNum()+"\t"+board.getId()
						+"\t"+board.getTitle()+"\t"+board.getContent()
						+"\t"+board.getWriteDate()+"\t"+board.getHit());
		}
	}
	public void selectMenu(){
		System.out.println("*******�Խñ���ȸ********");
		//���⿡�� BoardDAO�� �޼ҵ带 ȣ���ϼ���
		ArrayList<BoardDTO> boardlist = dao.select();
		int size = boardlist.size();
		for(int i=0;i<size;i++) {
			BoardDTO board = boardlist.get(i);
			System.out.println(board.getBoardNum()+"\t"+board.getId()
						+"\t"+board.getTitle()+"\t"+board.getContent()
						+"\t"+board.getWriteDate()+"\t"+board.getHit());
		}
	}
	public void readMenu() {
		Scanner key =  new Scanner(System.in);
		System.out.println("*******�Խñ� �󼼺���********");
		System.out.print("�Խñ� ��ȣ:");
		int boardnum = key.nextInt();
		BoardDTO board = dao.read(boardnum);
		if(board == null) {
			System.out.println("��ȸ�� �����Ͱ� �����ϴ�.");
		}else {
			System.out.println("�۹�ȣ:"+board.getBoardNum());
			System.out.println("�Խ��� ID:"+board.getId());
			System.out.println("����:"+board.getTitle());
			System.out.println("����:"+board.getContent());
			System.out.println("�Խ���:"+board.getWriteDate());
			System.out.println("��ȸ��:"+board.getHit());
		}
	}
}


















