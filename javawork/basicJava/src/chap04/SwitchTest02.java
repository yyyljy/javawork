package chap04;

import java.util.Scanner;

//switch���� - �⺻����(MultiIfTestŬ������ ������ switch�� ����)
//switch�� if~else if���� ����� �� �ִ� ���
public class SwitchTest02 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("�ֹι�ȣ�Է�:");
		int ssn = key.nextInt();//7��° ���� �Է�
		switch(ssn) {
			case 1:
			case 3:
				System.out.println("����");
				break;
			case 2: 
			case 4: 
				System.out.println("����");
				break;
			default: 
				System.out.println("��Ÿ");
		}
	}

}
