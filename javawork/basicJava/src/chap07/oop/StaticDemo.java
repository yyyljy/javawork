package chap07.oop;
//static������ ������ �� �ִ� ����
//static���� ������ ������ �ν��Ͻ��� ������ ���� �����ϴ� �ν��Ͻ� ������ �ƴϹǷ�
//�ν��Ͻ������� ������ �� ����.
//Ŭ���������� �����ؾ� �Ѵ�.
public class StaticDemo {
	String name;
	int num;
	static int staticNum;
	public StaticDemo() {
	}
	public StaticDemo(String name) {
		this.name = name;
		num++;
		staticNum++;
	}
	public void display() {
		System.out.println("name:"+name+",num:"+num+",staticnum:"+staticNum);
	}
}
