package chap04;

import java.util.Scanner;

//switch���� - �⺻����(MultiIfTestŬ������ ������ switch�� ����)
//switch�� if~else if���� ����� �� �ִ� ���
public class SwitchTest01 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("�ֹι�ȣ�Է�:");
		int ssn = key.nextInt();//7��° ���� �Է�
		switch(ssn) { //true | false�� �Ǵ��� �� �ִ� ������ �ƴ϶�
					//���� ���� ����� ����, �����, �޼ҵ� ȣ��
			case 1: //ssn������ ����� ���� case������ �� - �񱳿����� ��� �Ұ�
				System.out.println("����");
				break; //break���� ������ switch���� ����������.
			case 2: 
				System.out.println("����");
				break;
			case 3: 
				System.out.println("����");
				break;
			case 4: 
				System.out.println("����");
				break;
			default: //if���� else�� ���� ���� 
				System.out.println("��Ÿ");
		}
	}

}