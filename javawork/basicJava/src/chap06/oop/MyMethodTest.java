package chap06.oop;
//MyMethodŬ�������� ������ �޼ҵ带 ����ϴ� Ŭ����
public class MyMethodTest {
	//1. �Ű������� ���� ���ϰ��� ���� �޼ҵ�
	public static void main(String[] args) {
		MyMethod m = new MyMethod();
		//1.�Ű������� ���� void�� �޼ҵ��� ȣ��
		m.display();
		
		System.out.println("=======");
		//2. �Ű������� �� ��, ���ϰ��� ���� �޼ҵ��� ȣ��
		m.display("��");
		m.display("��");
		m.display("��");
		
		System.out.println("========");
		//3. �Ű������� �� ��, ���ϰ��� ���� �޼ҵ��� ȣ��
		m.display("��HIHIHIHIHIHI��", 4);
		
		//4. �Ű������� ���ϰ��� �ִ� �޼ҵ��� ȣ��
		//�޼ҵ带 ȣ���ϴ� ��� ���ϰ��� �����ϴ� �޼ҵ��� ���ϰ���
		//�絿���� Ÿ���� ������ �����ؼ� ������ �־�� �Ѵ�.
		//��ٸ� �޼ҵ��� �Ű������� ������ �� �ִ�.
		int result = m.add(100, 200);
		System.out.println(result);
		System.out.println(m.add(300, 500));
		System.out.println("===���α׷� ����===");
	}
}
