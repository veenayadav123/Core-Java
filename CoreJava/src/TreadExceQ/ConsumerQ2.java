package treadExceQ;

public class ConsumerQ2 extends Producer_Q2 implements Runnable {

	@Override
	public void run() {

		System.out.println(getMessage());
	}

	public static void main(String[] args) {

		ConsumerQ2 c = new ConsumerQ2();

		Thread t = new Thread(c);

		c.setMessage("producer_consumer relationship");

		t.start();
	}
}
