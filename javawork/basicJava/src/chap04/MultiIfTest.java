package chap04;

import java.util.Scanner;

//if~ else if�� �׽�Ʈ
public class MultiIfTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("�ֹι�ȣ�Է�:");
		int ssn = key.nextInt();//7��° ���� �Է�
		if(ssn==1 | ssn==3) {
			System.out.println("����");
		}else if(ssn==2 | ssn==4){
			System.out.println("����");
		}else {
			System.out.println("��Ÿ");
		}
	}

}