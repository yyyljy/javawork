package chap06.oop;
//�޼ҵ� �����ϴ� ������ ���� Ŭ����
public class MyMethod {
	//4. �Ű�����, ���ϰ��� ��� �ִ� �޼ҵ�
	//=> ���� 2���� �Ű������� ���޹޾� ���� ����� �����ϴ� �޼ҵ�
	//	 �޼ҵ� ����ο� ����Ÿ���� �����ϴ� ��� �ݵ�� �޼ҵ��� ����������
	//	 ���� return�ؾ� �Ѵ�.
	public int add(int num1, int num2) {
		return num1+num2;
	}
	
	//3. ���ϰ��� ���� �Ű������� �� ���� �޼ҵ�
	public void display(String str, int count) {
		for(int i=0;i<count;i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	//2. ���ϰ��� ���� �Ű������� �� ���� �޼ҵ�
	public void display(String str) {
		for(int i=1;i<=10;i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	//1. �Ű������� ���� ���ϰ��� ���� �޼ҵ�
	public void display() {
		for(int i=1;i<=10;i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
