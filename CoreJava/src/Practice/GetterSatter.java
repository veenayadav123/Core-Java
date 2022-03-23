package Practice;

public class GetterSatter {

	private String name;
	private int age;
	private String address;

	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public int getAge() {

		return age;
	}

	public void setAge(int age) {

		this.age = age;
	}

	public String getAddress() {

		return address;

	}

	public void setAddress(String adr) {

		address = adr;
	}

	public static void main(String[] args) {

		GetterSatter gs = new GetterSatter();

		gs.setName("Riya");
		System.out.println(gs.getName());

		gs.setAge(23);
		System.out.println(gs.getAge());

		gs.setAddress("Indore");
		System.out.println(gs.getAddress());
	}
}
