package excercise_4;

public class PalindromNoQ12 {
	public static void main(String[] args) {
		int no=78587,reverseNo=0,reminder;
		int i=no;
		while(no!=0) {
			reminder=no%10;
			reverseNo=reverseNo*10+reminder;
			//no/=10;
			no=no/10;
			
		}
		if(i==reverseNo) {
			System.out.println(i+"is Palindrom");
			
		}else {
			System.out.println(i+" is not Palindrom");
		}
		
		
	}
	}


