package chap04;

import java.util.Scanner;
//��øif�� - if�� �ȿ� if�� �����ϰ� ����ϱ�(��� ����� ��ø�� �� �ִ�)
public class ifTest03 {
	public static void main(String[] args) {
		//Scanner�� ������ �Է� �޾� 90�� �̻��̸� "���"�� ����ϰ�
		//90 �̸��̸� "�����"�� ���
		Scanner scanNum = new Scanner(System.in);
		System.out.print("��������:");
		int score = scanNum.nextInt();
		System.out.print("����Ƚ��:");
		int count = scanNum.nextInt();
		if(score >= 90) {
			System.out.println("���");
		}
		else {
			if(count>=3) {
				System.out.println("ó������ �ٽ� ����...");
			}
			else {
				System.out.println("�� ���� �����...");	
			}
		}		
	}
}