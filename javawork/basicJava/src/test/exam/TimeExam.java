package test.exam;
public class TimeExam{
	public static void main(String[] args){
		//time������ ����� ���� �� �������̴�.
		//___�� ____�� ____��   �� ���·� ����ϱ�
		int time = 8888;
		int h = time/(60*60);
		int time2 = time%(60*60);
		int m =  time2/60;
		int s = time2%60;
		System.out.println(h+"�� " + m+"�� "+ s+"��");


	}
}