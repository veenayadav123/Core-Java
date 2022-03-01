package SuperKey;

public class SuperCMetd extends SuperPMetd {

	public static void main(String[] args) {

		SuperCMetd c = new SuperCMetd();
		
		int j = c.add();
		
		System.out.println(j);
		
		}

	public int add() {
		
		System.out.println("child add");

		return super.add();
		
		}

}
