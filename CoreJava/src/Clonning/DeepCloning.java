package Clonning;

public class DeepCloning implements Cloneable {

	public String name = null;
	public ShalowCloning account = null;

	public DeepCloning(String name) {

		this.name = name;
		account = new ShalowCloning(10);

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		DeepCloning d = (DeepCloning) super.clone();

		d.account = (ShalowCloning) account.clone();

		return d;
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		DeepCloning d1 = new DeepCloning("Ram");
		DeepCloning d2 = (DeepCloning) d1.clone();
		System.out.println(d2.name);
		System.out.println(d2.account);

		d2.name = "Shyam";

		d2.account.balance = 20;

		System.out.println("Original data");
		System.out.println("balance : " + d1.account.balance);
		
		System.out.println("name  " +d1.name);
		System.out.println("Clone data");
		
		System.out.println("balance : " + d2.account.balance);
		System.out.println("name : " + d2.name);

	}
	

}
