package chap04;

import java.util.Scanner;

//������ ���̸� �Է� �޾Ƽ� ������ ���� ����ϱ�
//�Է°� : 1,3�� ���� 2,4�� ����
//		���� 1~19	:	û�ҳ�
//			20	:	����
//���� 3�� ���� 20�� �Է��� ���
// ���γ���
public class IfExam02 {
	public static void main(String[] args) {
		Scanner scanVal = new Scanner(System.in);
		System.out.print("����:");
		int gender = scanVal.nextInt();
		System.out.print("����:");
		int age = scanVal.nextInt();
		if (gender < 1 | gender > 4) {
			System.out.println("�ùٸ� ���� �Է�");
		}
		else{
			if (gender == 1 || gender == 3) {
				if (age >= 1 && age <= 19) {
					System.out.println("û�ҳⳲ��");
				} else {
					System.out.println("���γ���");
				}
			} else {
				if (gender == 2 || gender == 4) {
					if (age >= 1 && age <= 19) {
						System.out.println("û�ҳ⿩��");
					} else {
						System.out.println("���ο���");
					}
				}
			}
		}
	}

}
