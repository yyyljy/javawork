package chap07.oop;
/*
 * <<상속관계에서 멤버변수가 갖는 특징>>
 * 1. 상속관계에서는 상위 클래스에 정의된 멤버변수를 하위 클래스에서 사용할 수 있다.
 * 	  => 하위 클래스 참조 변수를 통해서 접근할 수 있다
 * 2. 상위클래스의 변수와 동일한 이름의 변수를 하위클래스에 정의하면 
 *	  => 하위 클래스의 멤버변수가 우선순위가 높다.
 * 3. 부모클래스의 변수를 엑세스 하려면 super를 이용해서 접근한다.
 * 	  this  -> 자기 자신의 객체
 * 	  super -> 부모 객체
*/

class Super{
	int num = 100;
}

class Sub extends Super{
	public void display() {
		System.out.println("num=>"+num);//부모클래스의 변수를 엑세스할 수 있다.
		System.out.println("부모의 num=>"+super.num);
	}
}
public class InheritanceTest01 {
	public static void main(String[] args) {
		//상위 클래스는 하위 클래스의 일반적인 내용을 정의하기 위해서 사용하는 클래스이므로
		//주로 하위 클래스를 생성해서 사용한다.
		Sub obj = new Sub();
		Sub obj1 = new Sub();
		obj.display();
		obj1.display();
		obj.num = 200;
		obj.display();
		obj1.display();
	}

}
