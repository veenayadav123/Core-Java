package collection;

import java.util.ArrayList;
import java.util.Stack;

public class ReversArr {

	public static void main(String[] args) {

		Stack stk = new Stack();
		
		ArrayList al = new ArrayList();

		stk.push("One");
		stk.push("Two");
		stk.push("Three");

		//System.out.println(stk);

		Object obj = stk.peek();
		//System.out.println(obj);
		System.out.println(stk.size());
		
		for(int i=stk.size(); i<=stk.size();i--) {
			
			//Object obj2 = stk.pop();
			
			System.out.println(stk.peek());
			
			stk.pop();
			
			//System.out.println(stk.size());
			
			
			//System.out.println(args[(int) i]);
			
		}
		//System.out.println(obj);

		//System.out.println(stk);    

		//Object obj1 = stk.pop();
		//System.out.println(obj1);

		//sSystem.out.println(stk);
	}

}
