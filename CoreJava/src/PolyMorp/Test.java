package polyMorp;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println("POlymorphism : Method Overriding");
		
		Person p = new Employee();
		Person p1 = new Person();
		Employee e = new Employee();
		
		p.showDetail();
		
		p1.showDetail();
		
		e.showDetail();
		
	}

}
