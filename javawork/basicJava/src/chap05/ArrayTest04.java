package chap05;

import java.util.Random;

//�迭�� ����, ����, �ʱ�ȭ�� �Ѳ����� ó���ϴ� ���
public class ArrayTest04 {
	public static void main(String[] args) {
		//�ٸ� ���� ������ ������� �����ϱ� - ','�� �迭 ��Ҹ� ����
		//int [] myArr = new int[5];
		int[] myArr = {10, 20, 30, 40, 50};
		System.out.println("�迭 ����� ����:"+myArr.length);
		for(int i=0;i<myArr.length;i++) {
			System.out.println(myArr[i]);
		}
		
		//�ڹپ�� ��� ����, ����, �ʱ�ȭ
		int[] myArr2 = new int[] {10, 20, 30, 40, 50};
		System.out.println("�迭 ����� ����:"+myArr2.length);
		for(int i=0;i<myArr2.length;i++) {
			System.out.println(myArr2[i]);
		}
		
		//������ �迭�� ����� ������ �ʱ�ȭ�� �Ѳ�����
		String[] strArr = {new String("java"),
							new String("servlet"),
							new String("spring")};
		System.out.println("�������迭�� ����:"+strArr.length);
		//������ �迭�̱� ������ ��ü�� �Ҵ�� ���� �ּҰ��� ��µǾ�� ������
		//String�� ����
		for(int i=0;i<strArr.length;i++) {
			System.out.println("�迭���=>"+strArr[i]);
		}
		
		Random[] randArr = {new Random(), new Random()};
		for(int i=0;i<randArr.length;i++) {
			System.out.println("�迭���=>"+randArr[i]);
		}
		
		//StringŬ������ �⺻��ó�� ����� �� �ִ�. - ���� ���� ���̴� �������̹Ƿ� ���
		String[] strArr2 = {"java", "servlet", "spring", "hadoop"};
		System.out.println("����:"+strArr2.length);
		for(int i=0;i<strArr2.length;i++) {
			System.out.println(strArr2[i]);
		}
	}

}