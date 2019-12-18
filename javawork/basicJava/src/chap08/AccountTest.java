package chap08;

public class AccountTest {
	public static void main(String[] args) {
		Account account = new Account();
		account.setAccount("441-0290-1203");
		account.setBalance(500000);
		account.setInterestRate(7.3);
		System.out.println("��������:"+account.getAccount()
					+" �����ܾ�:"+account.getBalance());
		try {
			account.deposit(-10);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			account.withdraw(600000);
		}catch(Exception e) {
			System.out.println("�ݾ��� 0���� ���ų� ���� �ܾ׺��� �����ϴ�.");
		}
		System.out.println("����:"+account.calculateInterest());
	}
}









