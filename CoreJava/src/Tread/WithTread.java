package Tread;

public class WithTread extends Thread {

	private String name = null;

	public WithTread(String name) {

		this.name = name;

	}

	public void run() {

		for (int i = 0; i < 50; i++) {

			System.out.println(i + "Hello Thread " + name);

		}
	}

}
