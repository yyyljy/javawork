package chap07.oop;
/*
 * <<��Ӱ��迡�� �޼ҵ尡 ���� Ư¡>>
 * 1. ��Ӱ��迡���� ���� Ŭ������ ���ǵ� �޼ҵ带 ���� Ŭ�������� ����� �� �ִ�.
 * 	  => ���� Ŭ���� ���� ������ ���ؼ� ������ �� �ִ�
 * 2. ����Ŭ������ ���ǵ� �޼ҵ�� ������ �޼ҵ带 ����Ŭ�������� �����ϰ� ����� �� �ִ�.
 * 	    �� ��� ����Ŭ������ �޼ҵ尡 ȣ��ȴ�.
 * 	  => ���� Ŭ������ ����� �޼ҵ�� ������ �޼ҵ带 ����Ŭ������ �����ϴ� ����
 *       �޼ҵ� ������(�޼ҵ� �������̵�)��� �Ѵ�.
 *                ------------
 *             �ݵ�� �޼ҵ��, �Ű����� ����, Ÿ��, ����Ÿ�� ��� ���� �ؾߵȴ�.
 * 3. �θ�Ŭ������ �޼ҵ带 ����ϰ� ���� ��� super�� ȣ���Ѵ�. 
*/
class Parent{
	public void display() {
		System.out.println("�θ��� display...");
	}
}

class Child extends Parent{
	public void display() {
		System.out.println("�ڽ� Ŭ������ display");
	}
	public void test() {
		System.out.println("�ڽ� Ŭ������ test...");
		display();
	}
}

public class InheritanceTest02 {
	public static void main(String[] args) {
		Child obj = new Child();
		obj.test();
		obj.display();
	}

}