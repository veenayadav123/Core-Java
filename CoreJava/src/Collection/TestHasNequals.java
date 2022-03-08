package Collection;

public class TestHasNequals {
	
	public static void main(String[] args) throws Exception{
		
		hasCodeNequals h1 = new hasCodeNequals("A1","Shreya",95);
		
		hasCodeNequals h2 = new hasCodeNequals("A1","Sayna",90);
		
		if(h1.hashCode() == h2.hashCode()) {
			
			if(h1.equals(h2)) {
				
				System.out.println("both are same");
			}
			else {
				
				System.out.println("both object not same");
			}
		}
	}

}
