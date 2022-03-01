package Calculater;

public class SwtchCalci {
	public static void main(String[] args) {
		String size=args[0];
		int i=Integer.parseInt(args[1]);
		int j=Integer.parseInt(args[2]);
		int k;
		
		switch(size) {
		case "Add":
			k=i+j;
			System.out.println("Addition is :"+k);
			break;
			
		case "Sub":
			k=i-j;
			System.out.println("Subtraction is :"+k);
			break;
			
			
		case "Multi":
			k=i*j;
			System.out.println("Subtraction is :"+k);
			break;
			
		case "Div":
			k=i/j;
			System.out.println("Subtraction is :"+k);
			break;
			
			default:
			System.out.println("Invalid value");
			break;
			
		
	}

	}
}
