package chap08;

import java.util.Scanner;

//���ܰ� �߻��� ������ ���ܸ� ó���ϵ��� ����
//���ܰ� �߻��� ������ ���ܸ� ó���ϸ� ȣ���ϴ� �������� � ���ܰ� �߻��ߴ��� �� �� ����
//���ܰ� �߻��Ҷ� ��쿡 ���� �ٸ��� ó���ϰ� �; �� �� ����.
public class ThrowsTest01 {
	public int test(int num1,int num2) {//��길 �ϴ� �޼ҵ�
		int result =0;
		try {
			System.out.println("-------test()�޼ҵ� ����-------");
			System.out.println("�Է°�:"+num1);
			System.out.println("�Է°�:"+num2);
			result = num1/num2;
			System.out.println("���:"+result);
			System.out.println("-------test()�޼ҵ� ����-------");
		}catch(ArithmeticException e) {
			//���ܰ� �߻��Ǹ� result�������� 0�� �����Ѵ�.
			result = 0;
		}
		return result;
	}
	public void show() {//���ڸ� �����ϸ� test()�� ȣ���ϴ� �޼ҵ�
		Scanner key = new Scanner(System.in);
		System.out.print("�����Է�:");
		int num1 = key.nextInt();
		System.out.print("�����Է�:");
		int num2 = key.nextInt();
		int result = test(num1, num2);
		
		//������ ����Ǿ�� �ϴ� ��ɹ�
		System.out.println("test()ȣ����:"+result);
	}
	public static void main(String[] args) {
		ThrowsTest01 obj = new ThrowsTest01();
		obj.show();
	}

}
