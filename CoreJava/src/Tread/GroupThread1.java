package tread;

public class GroupThread1 extends Thread {

	public GroupThread1(ThreadGrp tg, String name) {

		super(tg, name);
	}

	public void run() {
		for (int match = 1; match < 10; match++) {
			String msg = getName();
			msg += "played match " + match;
			System.out.println(msg);

		}
	}
}

