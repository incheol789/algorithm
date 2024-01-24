package org.example.StackQueue_SEC_5;

import java.util.LinkedList;
import java.util.Scanner;

public class 교육과정설계 {
	public String solution(String need, String plan) {
		String answer = "YES";
		LinkedList<Character> Q = new LinkedList<>();
		for (char x : need.toCharArray()) {
			Q.offer(x);
		}
		for (char x : plan.toCharArray()) {
			if (Q.contains(x)) {
				if (x != Q.poll()) return "NO";
			}
		}
		if (!Q.isEmpty()) {
			return "NO";
		}

		return answer;
	}

	public static void main(String[] args) {
		교육과정설계 T = new 교육과정설계();
		Scanner kb = new Scanner(System.in);
		String a = kb.next();
		String b = kb.next();
		System.out.println(T.solution(a, b));
	}
}
