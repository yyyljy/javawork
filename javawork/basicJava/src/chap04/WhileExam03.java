package chap04;

public class WhileExam03 {

	public static void main(String[] args) {
		int sumAll = 0;
		int sumEven = 0;
		int sumOdd = 0;
		int count = 0;
		while(count<101) {
			sumAll += count;
			if(count%2==0) {
				sumEven += count;
			}else {
				sumOdd += count;
			}
			count++;
		}
		System.out.println("����:"+sumAll);
		System.out.println("¦����:"+sumEven);
		System.out.println("Ȧ����:"+sumOdd);
	}

}
