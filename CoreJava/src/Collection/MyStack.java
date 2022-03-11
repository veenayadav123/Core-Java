package Collection;

import java.util.Stack;

public class MyStack {

	public static void main(String[] args) {

		Stack s1 = new Stack();
		Stack s2 = new Stack();

		s1.push("one");
		s1.push("two");
		s1.push("three");
		s1.push("four");
		s1.push("five");

		System.out.println(s1);

		System.out.println(s1.size());

		for (int i = 1; i <= s1.size(); i++) {

			s2.push(s1.pop());

		}

		System.out.println(s2);

	}

}
