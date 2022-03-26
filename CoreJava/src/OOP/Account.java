package oop;

import tread.RacingCondThread;

public class Account {

	private String number = null;
	private String accountType = null;
	private double balance = 0;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposite(String name, int i) {
}
	
	public static void main(String[] args) {
		
		RacingCondThread u1 = new RacingCondThread("Ram");
		RacingCondThread u2 = new RacingCondThread("Tanmay");
		u1.start();
		u2.start();
	}
	public void deposit(String name, int i) {
		// TODO Auto-generated method stub
		
	}

	
}
