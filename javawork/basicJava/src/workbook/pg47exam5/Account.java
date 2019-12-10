package workbook.pg47exam5;

public class Account {
	private String account;
	private int balance;
	private double interestRate;
	
	public void setAccount(String account) {
		this.account = account;
	}
	public String getAccount() {
		return this.account;
	}
	public int getBalance() {
		return this.balance;
	}
	
	public double calculateInterest() {
		return (double)(this.balance)*this.interestRate/100;
	}
	public void deposit(int money) {
		this.balance += money;
	}
	public void withdraw(int money) {
		this.balance -= money;
	}
	////////////////////////////////////////////////////
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public double getInterestRate() {
		return this.interestRate;
	}
	
	public void print() {
		System.out.println("��������: "+ getAccount()+" �����ܾ�: "+ getBalance());
	}
	
}
