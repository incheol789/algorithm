package org.example.Array_SEC_2;

import java.util.Scanner;

public class 격자판최대합 {
	public int solution(int n, int[][] arr) {
		int answer = Integer.MAX_VALUE;

		return answer;
	}

	public static void main(String[] args) {
		격자판최대합 T = new 격자판최대합();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		System.out.println(T.solution(n, arr));
	}
}
