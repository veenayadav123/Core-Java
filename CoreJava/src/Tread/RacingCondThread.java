package Tread;

//import OOP.Account;

public class RacingCondThread extends Thread {

	public static Account data = new Account();

	public RacingCondThread(String name) {

		super(name);
	}

	public void run() {
		for (int i = 0; i < 5; i++) {

			data.deposit(getName(), 1000);
		}
	}

	public static void main(String[] args) {

		RacingCondThread u1 = new RacingCondThread("Ram");
		RacingCondThread u2 = new RacingCondThread("Rashmi");

		u1.start();
		u2.start();
		System.out.println("Done");
	}

}
