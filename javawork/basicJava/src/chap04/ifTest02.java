package chap04;

import java.util.Scanner;
//if~else���� Scanner
public class ifTest02 {
	public static void main(String[] args) {
		//Scanner�� ������ �Է� �޾� 90�� �̻��̸� "���"�� ����ϰ�
		//90 �̸��̸� "�����"�� ���
		Scanner scanNum = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���:");
		int score = scanNum.nextInt();
		if(score >= 90) {
			System.out.println("���");
		}
		else {
			System.out.println("�����");
		}
	}

}