package constructor1;

public class ConstructHello {
	public static void main(String[] args) {
		
		//Hello h=new Hello();
		Hello h1=new Hello("Veena",21);
		
		System.out.println(h1.getName()+h1.getNo());
		//System.out.println(h);
		
	}

}
