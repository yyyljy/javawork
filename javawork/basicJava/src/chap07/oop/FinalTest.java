package chap07.oop;
final class FinalSuper {
	public final void display() {
		System.out.println("super display");
	}
}
class FinalSub extends FinalSuper{//final Ŭ������ ����� �Ұ���.
	static final int NUM = 100;

	@Override //annotation
	public void display() {//final�޼ҵ�� �������̵� �� �� ����.
		System.out.println("display");
	}
}

public class FinalTest{
	public static void main(String[] args) {
		FinalSub obj = new FinalSub();
		//obj.NUM = 10000; // final�� ����Ǿ� �� ���� �Ұ�
		System.out.println(FinalSub.NUM);
		obj.display();
	}
}