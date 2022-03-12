package Tread;

public class PriorityTread extends Thread {

	public PriorityTread(String name) {

		super(name);
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {

			System.out.println(getName() + "P = " + getPriority());
		}
	}

}
