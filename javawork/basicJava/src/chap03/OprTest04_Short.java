package chap03;
//�񱳿����� - ||, &&
public class OprTest04_Short {
	public static void main(String[] args) {
		int num = 100;
		String str = null;//���� str�� �ƹ��͵� ������� ���� ����
		//str.length();
		System.out.println(num>=100 || str.length()>10);
		//System.out.println(num>=100 | str.length()>10);
		//&&�����ڴ� �տ��� false�� �ڿ� Ȯ�� X
		//||�����ڴ� �տ��� true�� �ڿ� Ȯ�� X
		
		System.out.println(num<100 && str.length()>10);
		System.out.println(num<100 & str.length()>10);
	}

}
