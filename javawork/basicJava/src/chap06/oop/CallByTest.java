package chap06.oop;
//�޼ҵ��� �Ű������� �⺻���� �������� �����ϴ� ��� ������
public class CallByTest {
	public static void main(String[] args) {
		CallByTest obj = new CallByTest();
		//����� �⺻�� ������ ������ ������ �ʱ�ȭ
		int i = 100;
		int[] myarr = new int[5];
		for (int j = 0; j < myarr.length; j++) {
			myarr[j] = 100;
		}
		System.out.println("====change ȣ�� ��====");
		obj.display(i, myarr);
		obj.change(i, myarr);
		System.out.println("====change ȣ�� ��====");
		obj.display(i, myarr);
	}
	//�Ű������� ���޵� num�� ���� myarr�� �����ϴ� �迭�� ��Ұ��� ����ϴ� �޼ҵ�
	public void display(int num, int[] myarr) {
		System.out.println("i="+num);
		System.out.println("myarr�� ��� ��");
		for (int i = 0; i < myarr.length; i++) {
			System.out.print(myarr[i]+"\t");
		}
		System.out.println();
	}
	//�Ű������� ���޵� i�� myarr�� �����ϴ� �迭�� ��Ұ��� �����ϴ� �޼ҵ�
	public void change(int i, int[] myarr) {
		i = 200;
		myarr[1] = 200;
	}

}
