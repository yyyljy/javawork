package api.util;

import java.util.Scanner;

//ScannerŬ����(API)�� �����
//=> ���α׷� ���� �߰��� ���� �Է¹��� �� �ִ� ��ɵ��� �����ϴ� Ŭ����
public class ScannerTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��ϼ���:");
		String data = key.next();
		//next => �����̽��� or ����Ű �Է� ������ �Է��� ���ڿ��� ����
		System.out.println("Ű����� �Է¹��� ���ڿ�:"+data);
		System.out.print("���ڸ� �Է��ϼ���:");
		int intVal = key.nextInt();
		System.out.println("Ű����� �Է¹��� ����:"+intVal);
	}

}
