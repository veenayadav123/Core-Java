package collection;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {

		Stack stk = new Stack();

		stk.push("One");
		stk.push("Two");
		stk.push("Three");

		System.out.println(stk);

		Object obj = stk.peek();
		System.out.println(obj);

		System.out.println(stk);

		Object obj1 = stk.pop();
		System.out.println(obj1);

		System.out.println(stk);

	}
}
