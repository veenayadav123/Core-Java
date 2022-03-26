package excercise_4;

public class ArmstrongQ10 {
	public static void main(String[] args) {
		
		int no=153,reminder,result=0;
		
		int orgNo=no;
		
		while(orgNo != 0) {
			reminder = orgNo % 10;
			
			//result+=Math.pow(reminder, 3);
			//result=result+(reminder*reminder*reminder);
			
			 result+=(reminder*reminder*reminder);
			 orgNo/=10;
			}
		if(result==no) {
			System.out.println(no+" is an Armstrong Number");
			
		}else {
			System.out.println(no+" is not an Armstrong Number");
		}
		
	}

}
