package chap04;

import java.util.Scanner;

//점수를 Scanner로 입력
/* 90~100	: A
 * 80~89	: B
 * 70~79	: C
 * 60~69	: D
 * 0~59		: F
 * 0~100외	: 잘 못 입력
*/
public class ScoreMultiIfExam {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("점수입력:");
		int score = key.nextInt();
		if(score>=90 & score <=100) {
			System.out.println("A");
		}else if(score>=80 & score <=89) {
			System.out.println("B");
		}else if(score>=70 & score <=79) {
			System.out.println("C");
		}else if(score>=60 & score <=69) {
			System.out.println("D");
		}else if(score>=0 & score <=59) {
			System.out.println("F");
		}else{
			System.out.println("잘 못 입력");
		}
	}

}
