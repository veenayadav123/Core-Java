package Calculater;

public class Calcula1 {
	public static void main(String[] args) throws Exception {
		int ch= System.in.read();
		//char ch1=(char)System.in.read();
		if(ch=='A' || ch == 'a') {
		 add(2,5);		
		}
		else if(ch=='S' || ch == 's') {
			 Sub(2,5);		
			}
		else if(ch=='M' || ch== 'm') {
			Multiplication(8,9);
			
		}
		else if(ch=='D' || ch== 'd') {
			Division(25,8);
			
		}else {
			System.out.println("Incorrect choice");
		}
	
		
	}
        public static void add (int a,int b) {
		
        	System.out.println("Sum is:" +(a+b));
		
	}
        public static void Sub (int a,int b) {
        	if(a>b) {
    		System.out.println("Subtraction is:" +(a-b));
        	}
        	else {
        		System.out.println("Subtraction is:" +(b-a));
        	}
		
	}
       public static void Multiplication (int a,int b) {
    		
        	System.out.println("Multiplication is:" +(a*b));
		
	}
       public static void Division (int a,int b) {
    	   if(a>b) {
	
	       System.out.println("Division is:" +(a/b));
    	   }else
    	   {
    		   System.out.println("Division is:" +(b/a)); 
    	   }
	       

}

		
}
		
