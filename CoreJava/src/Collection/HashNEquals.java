package Collection;

public class HashNEquals {
	
	public static void main(String[] args) {
		
		String s = "Ram";
		
		String s1 = "Ram";
		
		String s2 = "Raj";
		
		System.out.println(s.hashCode());
		
		System.out.println(s1.hashCode());
		
		System.out.println(s.equals(s1));
		
		System.out.println(s.equals(s2));
		
		
	}

}
