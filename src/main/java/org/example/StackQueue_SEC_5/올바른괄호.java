package org.example.StackQueue_SEC_5;

import java.util.Scanner;
import java.util.Stack;

public class 올바른괄호 {
	/**
	 * 괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
	 * (())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.
	 */
	public String solution(String str) {
		String answer = "YES";
		Stack<Character> stack = new Stack<>();
		for (char x : str.toCharArray()) {
			if (x == '(') stack.push(x);
			else {
				if (stack.isEmpty()) return "NO";
				stack.pop();
			}
		}
		if (!stack.isEmpty()) return "NO";
		return answer;
	}

	public static void main(String[] args) {
		올바른괄호 T = new 올바른괄호();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
