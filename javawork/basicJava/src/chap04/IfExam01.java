package chap04;

import java.util.Scanner;

//���ڸ� �Է¹޾Ƽ� �������� ������� ����ϱ�
//��, ����� ��쿡�� ¦������ Ȧ������ ����ϱ�
//���� -> __�� �����Դϴ�.
public class IfExam01 {

	public static void main(String[] args) {
		Scanner numScan = new Scanner(System.in);
		System.out.print("���� �Է�:");
		int numVal = numScan.nextInt();
		if(numVal>0) {
			if(numVal%2==0) {
				System.out.println(numVal+"��(��) ¦���Դϴ�");
			}
			else {
				System.out.println(numVal+"��(��) Ȧ���Դϴ�");
			}
		}
		else {
			System.out.println(numVal+"��(��) �����Դϴ�");
		}
	}

}