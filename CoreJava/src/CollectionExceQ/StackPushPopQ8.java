package CollectionExceQ;

import java.util.Stack;

public class StackPushPopQ8 {

	public static void main(String[] args) throws Exception {

		Stack stk = new Stack();
		Stack stk1 = new Stack();

		for (char i = 'A'; i <= 'Z'; i++) {

			Object o = stk.push(i);
		}

		System.out.println(stk);

		for (int j = 0; j <26 ; j++) {

			Object o = stk.pop();

			stk1.push(o);

			System.out.print(stk1.pop());
		}
	}
}
