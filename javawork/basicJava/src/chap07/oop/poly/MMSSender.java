package chap07.oop.poly;
public class MMSSender extends Sender {
	int length;
	public MMSSender(String name,int length){
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
		//MMSSender�� ���� ����� ����
		System.out.println(length+"��"+name+"����");
	}
}
