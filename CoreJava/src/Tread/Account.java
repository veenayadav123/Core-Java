package Tread;

public class Account {

	private int balance = 0;

	public synchronized void deposit(String msg, int amt) {//method synchronization

		int bal = getBalance() + amt;
		setBalance(bal);
		System.out.println(msg + " new balance " + bal);
	}

	public synchronized void withdraw(String msg, int amt) {//Block synchronization

		int bal = 0;
		synchronized (this) {
			bal = getBalance() - amt;
			setBalance(bal);
		}
		System.out.println(msg + " Now Balance is " + bal);

	}

	public int getBalance() {

		databaseDelay();
		return balance;
	}

	public void setBalance(int balance) {
		databaseDelay();
		this.balance = balance;
	}

	public void databaseDelay() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {

		}
		this.balance = balance;

	}

}
