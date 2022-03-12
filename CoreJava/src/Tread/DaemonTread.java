package Tread;

public class DaemonTread extends Thread {
	
	public void run() {
		
		System.out.println("Daemon T Started " +Thread.currentThread());
		
		while(true) {
			try {
				Thread.sleep(500);
				System.out.println("Daemon T: woke up again");
			}
			catch(InterruptedException x) {
				
			}
		}
	}
	
	

}
