package practice;

public class TestGetterSetter {

	public static void main(String[] args) {

		GetterSatter gs = new GetterSatter();

		gs.setName("Ananya");
		System.out.println(gs.getName());

		gs.setAge(21);
		System.out.println(gs.getAge());

		gs.setAddress("Indore");
		System.out.println(gs.getAddress());
	}

}
