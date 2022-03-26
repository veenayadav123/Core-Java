package variabNOpertr;

public class StrBuilder {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		sb.append("hello Java");
		System.out.println("String : "+sb.toString());
		
		StringBuilder sb1 = new StringBuilder("Java Code");
		sb1.append(" is My Code");
		System.out.println("String1 : "+sb1.toString());

		StringBuilder sb2 = new StringBuilder(18);
		System.out.println("String2 : "+sb2.capacity());

		StringBuilder sb3 = new StringBuilder(sb1);
		System.out.println("String3 : "+sb.toString());

	}
}