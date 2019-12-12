package chap07.oop;

public class CheckingAccount extends Account{
	private String cardNo;

	public CheckingAccount() {
	}
	public CheckingAccount(String account, String ownerName, int balance, String cardNo) {
		super(account, ownerName, balance);
		this.cardNo = cardNo;
	}
	
	public void pay(String cardNo, int amount) {
		//���ڿ� �񱳴� ������ equals�� �̿��ؼ� ���Ѵ�.
		// '==' ���  X
		if(this.cardNo.equals(cardNo)) {
			if(this.getBalance() >= amount) {
				this.withdraw(amount);
			}else {
				System.out.println("�ܰ��� �����մϴ�.");
			}
		}
		else {
			System.out.println("������ �Ұ����մϴ�.");
		}
	}
}