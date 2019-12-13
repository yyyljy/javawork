package chap07.oop.poly;
//�߻�Ŭ���� - abstract�� �ǹ�
/*
 * �̿ϼ� Ŭ����, ��� ������ �����Ǿ� ���� ���� Ŭ������ �ϼ����� �ʾ����Ƿ� ��ü���� �Ұ�.
 * => �޼ҵ��� body�� �������� ���� �޼ҵ带 ���� �ִ� Ŭ����(�߻� �޼ҵ�)
 * 
 * 1) �߻�޼ҵ带 �����ϴ� ���
 * 	  ���������� abstract ����Ÿ�� �޼ҵ��();
 *	 => �߻�޼ҵ尡 ���ǵ� Ŭ������ �̿ϼ��� �߻�Ŭ������ �ǹǷ� �Ϲ� Ŭ������ �ٸ���
 *		�߻� Ŭ������ �����ϴ� ��� Ŭ���� ����ο��� abstract�� �߰��ؾߵȴ�
 * 2) �߻�Ŭ������ Ư¡
 * 	 - �Ϲݸ޼ҵ�� �߻�޼ҵ� ��� ������ �� �ִ�.
 * 	 - �߻�޼ҵ尡 �� �� �� ���ǵǾ� �ִ� Ŭ������ �ݵ�� abstract�� �߰��ؾ� �Ѵ�.
 * 	 - �߻�Ŭ������ �ν��Ͻ�ȭ �� �� ����.(��ü�����Ұ���)
 * 	 - �߻�Ŭ����(abstractŬ����)�� ����ϸ� ������ �߻��Ѵ�.
 * 		=> AbstractSub�� abstract�޼ҵ带 ���� �ִ� AbstractSuperŬ������ ����ϸ�
 * 			AbstractSubŬ������ �߻�Ŭ������ �����
 *		[�ذ���]
 *		1. ����Ŭ������ ���� �������� ���� Ŭ������ ����ο� abstract �߰�.
 *		2. ��� �߻�޼ҵ带 �ݵ�� �������̵�.
 * 3) �߻�Ŭ������ �߻�޼ҵ带 �ۼ��ϴ� ����
 *	 - �������� �����ϱ� ����
 * 	 - ����Ŭ������ ����ϱ� ���� ����(��ü ������ �������� �����ϱ� ����)
 * 	 - ����Ŭ�������� �ݵ�� �������ؾ��ϴ� �޼ҵ带 �������� �����Ͽ� �ݵ�� �������ϵ��� �ϱ� ���ؼ�
*/
abstract class AbstractSuper{
	public abstract void show();
	public void display() {
		System.out.println("display");
	}
	
}
class AbstractSub extends AbstractSuper{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
}
public class AbstractTest {

	public static void main(String[] args) {
		AbstractSuper obj = new AbstractSuper();
	}

}
