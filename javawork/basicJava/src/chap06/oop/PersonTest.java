package chap06.oop;
//Ŭ������ �����ϰ� ��������� �����ϴ� ���
// - ��������� �����Ҷ��� Ư���� ��츦 �����ϰ� �ʱⰪ�� ���� �ʴ´�.
// - �ʱⰪ�� �������� �ʾƵ� �������� null. �������� 0, �Ǽ��� 0.0, boolean�� false
// - ��������� ������ �� ���� �����ڸ� �߰��ؼ� ������ ������ �� �ִ�.
// - public
// - default
// - protected
// - private

public class PersonTest {
	public static void main(String[] args) {
		/*Person p1 = new Person();
		p1.setName("�嵿��");
		p1.setAddr("�����");
		p1.setAge(45); // age������ private���� ����Ǿ� �����Ƿ� 
					// ���� ��Ű���� Ŭ���������� ������ �� ����.
		System.out.println("����:"+p1.getName());
		System.out.println("�ּ�:"+p1.getAddr());
		System.out.println("����:"+p1.getAge());
		
		Person p2 = new Person();
		p2.setName("������");
		p2.setAddr("������");
		p2.setAge(15);
		System.out.println("����:"+p2.getName());
		System.out.println("�ּ�:"+p2.getAddr());
		System.out.println("����:"+p2.getAge());
		*/
		Person p3 = new Person("�ٴٴ�","��������������",999);
		p3.print();
	}

}
