package javabasics;

public class CL {
	public static void main(String[] args) throws Exception {
		
	
	    int ch= System.in.read();
		char ch1=(char)System.in.read();
	System.out.println("Selected char ASCII Code " +ch);
	
	if(ch=='A' || ch == 'a') {
	//Add.main(args);
		System.out.println("Ram");
}else if(ch1=='D' || ch1=='d') {
	//Division.main(args);
	System.out.println("Shyam");
}else {
	System.out.println("Incorrect Choice");
}


}
}
