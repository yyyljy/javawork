package exam.chp3;

public class chp3exam2 {
	public static void main(String[] args) {
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = (numOfApples%sizeOfBucket)==0?(numOfApples/sizeOfBucket):(numOfApples/sizeOfBucket)+1;
		
		System.out.println("�ʿ��� �ٱ����� �� :"+numOfBucket);
	}

}
