package OOP;

public class Const {

	private int id;
	private String name;
	public static final int PI = 3;

	//public static int getPi() {
		//return PI;
	

	public Const() {

		System.out.println("i an default const");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
