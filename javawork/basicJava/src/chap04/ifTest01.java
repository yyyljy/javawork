package chap04;

import java.util.Random;
//if���� RandomŬ����
public class ifTest01 {
	public static void main(String[] args) {
		//Random�� nextInt�� �̿��ؼ� 1���� 100���� ���� �߻���Ų �� �۾�
		Random rand = new Random();
		int num = rand.nextInt(100)+1;
		//int num = 90;
		if(num>=90) {
			System.out.println("����");
			System.out.println("�� ��° ����");
		}
		System.out.println("����");
	}

}
