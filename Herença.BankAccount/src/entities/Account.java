package entities;

public abstract class Account {

	private String holder;
	private Integer number;
	protected double balance;
	
	public Account() {
		
	}

	public Account(String holder, int number, double balance) {
		this.holder = holder;
		this.number = number;
		this.balance = balance;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
}
