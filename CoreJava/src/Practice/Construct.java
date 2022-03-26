package practice;

public class Construct {

	private String name;

	public void setName(String name) {
		this.name = name;
	}
	
	public Construct() {
		
	}

	Construct(String name) {

		this.name = name;
	}

	public String getName() {

		return name;
	}

	public static void main(String[] args) {

		Construct c = new Construct("Veena");

		// System.out.println(c.name);
		
		Construct c1 = new Construct();
		
		c1.getName();
		
		

		System.out.println(c.getName());
	}

}
