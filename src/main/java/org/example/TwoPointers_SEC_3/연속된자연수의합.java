package org.example.TwoPointers_SEC_3;

import java.util.Scanner;

public class 연속된자연수의합 {
	/**
	 * N 입력으로 양의 정수 N이 입력되면 2개 이상 연속된 자연수의 합으로 정수 N 표현하는
	 * 방법의 가짓수를 출력하는 프로그램을 작성하세요.
	 * 만약 N = 15이면,
	 * 7 + 8 = 15
	 * 4 + 5 + 6 = 15
	 * 1 + 2 + 3 + 4 + 5 = 15
	 */
	public int solution(int n) {
		int answer = 0, sum = 0, lt = 0;
		int m = n / 2 + 1;
		int[] arr = new int[m];
		for (int i = 0; i < m; i++) arr[i] = i + 1;
		for (int rt = 0; rt < m; rt++) {
			sum += arr[rt];
			if (sum == n) answer++;
			while (sum >= n) {
				sum -= arr[lt++];
				if (sum == n) answer++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		연속된자연수의합 T = new 연속된자연수의합();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.print(T.solution(n));
	}
}
