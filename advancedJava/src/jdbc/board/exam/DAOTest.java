package jdbc.board.exam;

import java.util.Scanner;
public class DAOTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("******�Խ���********");
		System.out.println("1. �Խñ۵��");
		System.out.println("2. �Խñ���ü�����ȸ");
		System.out.println("3. �Խñۼ���");
		System.out.println("4. �Խñۻ���");
		System.out.println("5. �������� �Խñ� �˻�");
		System.out.print("���ϴ� �۾��� �����ϼ���:");
		int choice  = key.nextInt();
		show(choice);
	}
	public static void show(int choice){
		MenuUI ui = new MenuUI();
		switch(choice){
			case 1:
				ui.insertMenu();
				break;
			case 2:
				ui.selectMenu();
				break;
			case 3:
				ui.updateMenu();
				break;
			case 4:
				ui.deleteMenu();
				break;
			case 5:
				ui.searchMenu();
				break;
		}
	}
}













