package chap07.oop.poly;
public class SMSSender extends Sender {
	int length;
	public SMSSender(String name,int length){
		super(name);
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void print() {
		//SMSSender�� ���� ����� ����
		System.out.println(length+"��"+name+"����");
	}
}
