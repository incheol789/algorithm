package org.example.DFSBFS_SEC_7;

public class 재귀함수_피보나치수열 {
	/**
	 * 피보나치 수열 : 앞의 2개의 수를 합하여 다음 숫자가 되는 수열
	 * ex) 7 입력 - 1 1 2 3 5 8 13
	 */
	static int[] fibo;

	public int DFS(int n) {
		if (fibo[n] > 0) {
			return fibo[n];
		}
		if (fibo[n] > 0) {
			return fibo[n];
		}
		if (n == 1) {
			return fibo[n] = 1;
		} else if (n == 2) {
			return fibo[n] = 1;
		} else return fibo[n] = DFS(n - 2) + DFS(n - 1);
	}

	public static void main(String[] args) {
		재귀함수_피보나치수열 T = new 재귀함수_피보나치수열();
		int n = 45;
		fibo = new int[n + 1];
		T.DFS(n);
		for (int i = 1; i <= n; i++) {
			System.out.print(fibo[i] + " ");
		}
	}
}
