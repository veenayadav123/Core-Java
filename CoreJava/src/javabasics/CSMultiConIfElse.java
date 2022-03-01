package javabasics;

public class CSMultiConIfElse {
	public static void main(Str[] args) {
		int Marks=50;
		if(Marks<33) {
			System.out.println("Student is Fail");
			}
		else if(Marks<45) {
			System.out.println("Student grade is C");
			
		}
		else if(Marks<60) {
			System.out.println("Student grade is B");
			
		}
		else if(Marks<75) {
			System.out.println("Student grade is A");
			
		}
		else if(Marks<100) {
			System.out.println("Student grade is Excillent A+");
			
		}
		else {
			System.out.println("Student Marks is not valid");
		}
		
	}

}
