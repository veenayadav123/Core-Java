package tread;

public class TestWithRunable {
	
public static void main(String[] args) {
		
		WithRunable t1 = new WithRunable("Shreya");
		
		Thread th = new Thread(t1);
		
		Thread th1 = new Thread(new WithRunable("Shuhash"));
		
		th.start();
		
		th1.start();
		
		System.out.println(t1.getName());
		
	}

}
