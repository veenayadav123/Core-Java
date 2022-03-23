package Tread;

public class TestPriorityTread {

	public static void main(String[] args) {

		PriorityTread t1 = new PriorityTread("Tread#A");
		PriorityTread t2 = new PriorityTread("Tread#B");
		PriorityTread t3 = new PriorityTread("Tread#C");

		t1.setPriority(3);
		t2.setPriority(2);

		t1.start();
		t2.start();
		t3.start();
	}

}
