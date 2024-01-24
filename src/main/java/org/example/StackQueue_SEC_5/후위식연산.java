package org.example.StackQueue_SEC_5;

import java.util.Scanner;
import java.util.Stack;

public class 후위식연산 {
	/**
	 * 후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.
	 * 만약 3*(5+2)-9 을 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12입니다.
	 */
	public int solution(String str) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		for (char x : str.toCharArray()) {
			if (Character.isDigit(x)) stack.push(x - 48);
			else {
				int rt = stack.pop();
				int lt = stack.pop();
				if (x == '+') stack.push(lt + rt);
				else if (x == '-') stack.push(lt - rt);
				else if (x == '*') stack.push(lt * rt);
				else if (x == '/') stack.push(lt / rt);
			}
		}
		answer = stack.get(0);

		return answer;
	}

	public static void main(String[] args) {
		후위식연산 T = new 후위식연산();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
