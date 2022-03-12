package Tread;

public class TestWithTread {
	
	public static void main(String[] args) {
		
		WithTread t1 = new WithTread("Dhoni");
		WithTread t2 = new WithTread("Virat");
		
		t1.start();
		t2.start();
		
		for(int i=0; i<50; i++) {
			
			System.out.println(i+"Main Thread");
			
		}
	}

}
