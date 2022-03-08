package CollectionExceQ;

import java.util.Stack;

public class Q8 {

	public static void main(String[] args) throws Exception {

		Stack stk = new Stack();
		Object stk1 = new Stack();

		for (char i = 'A'; i <= 'Z'; i++) {

			stk.push(i);

		}
		
		System.out.println(stk);
		
		while (0<stk.size()) {
			
			stk1 =stk.pop();
			
		}


		//System.out.println(stk);

	}

}
