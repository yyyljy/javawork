package chap04;

import java.util.Scanner;

//������ Scanner�� �Է�
/* 90~100	: A
 * 80~89	: B
 * 70~79	: C
 * 60~69	: D
 * 0~59		: F
 * 0~100��	: �� �� �Է�
*/
public class ScoreSwitchExam {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("�����Է�:");
		int score = key.nextInt();
		if(score>100 | score <0) {
			System.out.println("�� �� �Է�");
		}else{
			switch(score/10) {
				case 10:
				case 9:
					System.out.println("A");
					break;
				case 8:
					System.out.println("B");
					break;
				case 7:
					System.out.println("C");
					break;
				case 6:
					System.out.println("D");
					break;
				default:
					System.out.println("F");
			}
		}
	}

}
