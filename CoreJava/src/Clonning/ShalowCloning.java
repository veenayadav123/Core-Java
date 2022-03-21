package Clonning;

public class ShalowCloning implements Cloneable {

	public double balance = 0;

	public ShalowCloning(double d) {

		balance = d;

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		ShalowCloning s1 = new ShalowCloning(10);

		ShalowCloning s2 = (ShalowCloning) s1.clone();

		s2.balance = 20;

		System.out.println(s1.balance);

		System.out.println(s2.balance);

	}
	
	
}
