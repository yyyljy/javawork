package chap04;

//while�� ���� - ForTest01.java���� �۾��� ������ while������ ����
//"�ڹ����α׷���" 5�� ���
public class WhileTest01 {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 5) {
			System.out.println("�ڹ����α׷���");
			i++;
		}
		System.out.println("=========");
		i = 1;
		while (true) {
			if (i > 5) {
				break;
			}
			System.out.println("�ڹ����α׷���");
			i++;
		}
	}
}
