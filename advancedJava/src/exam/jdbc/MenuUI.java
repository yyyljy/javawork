package exam.jdbc;
import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	CustomerDAO dao = new CustomerDAO();
	public void insertMenu(){
		//�Ի��� : ���� ��¥, point : 1000
		System.out.println("*******�����********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�н�����:");
		String pass = key.next();
		System.out.print("����:");
		String name = key.next();
		System.out.print("����Ʈ:");
		int point = key.nextInt();
		System.out.print("�ּ�:");
		String addr = key.next();
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
		CustomerDTO user = new CustomerDTO(id,pass,name,point,addr);
		int result = dao.insert(user);
		if(result > 0) {
			System.out.println("�� ��� �Ϸ�");
		}else {
			System.out.println("�� ��� ����");
		}
	}
	public void updateMenu(){
		System.out.println("*******������********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�ּ�:");
		String addr = key.next();
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
		CustomerDTO user = new CustomerDTO(id,addr);
		int result = dao.update(id, addr);
		if(result > 0) {
			System.out.println("�ּ� ���� ���� �Ϸ�");
		}else {
			System.out.println("�ּ� ���� ���� ����");
		}
	}
	public void deleteMenu(){
		System.out.println("*******������********");
		System.out.print("���̵�:");
		String id = key.next();
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
		CustomerDTO user = new CustomerDTO(id);
		int result = dao.delete(id);
		if(result > 0) {
			System.out.println("�� ���� �Ϸ�");
		}else {
			System.out.println("�� ���� ����");
		}
	}
	public void findByAddrMenu(){
		System.out.println("*******����˻�********");
		System.out.print("�ּ�:");
		String addr = key.next();
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
	}
	public void selectMenu(){
		System.out.println("*******�����ȸ********");
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ��� - ��ü�����ȸ
	}
}


















