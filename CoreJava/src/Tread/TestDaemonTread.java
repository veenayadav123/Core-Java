package Tread;

public class TestDaemonTread {
	
	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
		DaemonTread t = new DaemonTread();
		t.setDaemon(true);
		t.start();
		
		try {
			
			Thread.sleep(3000);
		}
		catch(InterruptedException x) {
			
		}
		System.out.println("Leaving main method");
		System.out.println("Now JVM will exit");
	}

}
