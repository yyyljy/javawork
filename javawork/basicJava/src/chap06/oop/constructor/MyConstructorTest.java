package chap06.oop.constructor;

public class MyConstructorTest {
	public static void main(String[] args) {
		//�⺻ �����ڸ� ȣ���ؼ� ��ü�� ������ �� setter �޼ҵ带 �̿��ؼ� �� �ʱ�ȭ�ϱ�
		MyConstructor obj = new MyConstructor();
		obj.setName("�嵿��");
		obj.setId("jang");
		obj.setPass("1234");
		System.out.println(obj.getName()+","+obj.getId()+","+obj.getPass());
		
		//�Ű������� �ִ� ������ �޼ҵ带 ȣ���ϸ鼭 ���� �ʱ�ȭ�ϱ�
		//MyConstructor(String, String, String)
		MyConstructor obj1 = new MyConstructor("Kim", "kkk", "1234");
		System.out.println(obj1.getName()+","+obj1.getId()+","+obj1.getPass());
		
		System.out.println("=============");
		//MyConstructor(String, String, String,String)
		MyConstructor obj2 = new MyConstructor("Kim", "kkk", "1234","¯");
		System.out.println(obj2.getName()+","+obj2.getId()+","+obj2.getPass()+","+obj2.getNickname());
		
		
		System.out.println("=============");
		//MyConstructor(String, String, String, String, String, Int)
		MyConstructor obj3 = new MyConstructor("Kim", "kkk", "1234","����","¯", 1000);
		System.out.println(obj3.getName()+","+obj3.getId()+","+obj3.getPass()+","+obj3.getNickname()+","+obj3.getPoint());
	}
}
