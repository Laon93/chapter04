package util;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();
		
		stack.push("둘리");
		stack.push("길동");
		
		System.out.println(stack.isEmpty());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.isEmpty());
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());
		
	}

}
