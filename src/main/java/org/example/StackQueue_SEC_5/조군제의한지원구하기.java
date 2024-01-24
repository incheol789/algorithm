package org.example.StackQueue_SEC_5;

import java.util.LinkedList;
import java.util.Scanner;

public class 조군제의한지원구하기 {
	public int solution(int n, int k) {
		int answer = 0;
		LinkedList<Integer> Q = new LinkedList<>();
		for (int i = 1; i <= n; i++) Q.offer(i);
		while (!Q.isEmpty()) {
			for (int i = 1; i < k; i++) Q.offer(Q.poll());
			Q.poll();
			if (Q.size() == 1) answer = Q.poll();
		}
		return answer;
	}

	public static void main(String[] args) {
		조군제의한지원구하기 T = new 조군제의한지원구하기();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		System.out.println(T.solution(n, k));
	}
}
