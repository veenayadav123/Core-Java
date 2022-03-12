package Tread;

public class WithoutThread {
	
	String name = null;
	
	public WithoutThread(String name) {
		
		this.name = name;
	}
	public void run() {
		for(int i=0; i<50; i++) {
			
			System.out.println(i+"Hello Thread "+name);
			
		}
	}
	public static void main(String[] args) {
		
		WithoutThread t1 = new WithoutThread("Shreya");
		WithoutThread t2 = new WithoutThread("Shree");
		
		t1.run();
		t2.run();
	}

}
