package org.example.DFSBFS_SEC_7;

public class 재귀함수_피보나치수열 {
	// 피보나치 수열: 앞의 2개의 수를 합하여 다음 숫자가 되는 수열
	// 예를 들어, 7을 입력하면 1 1 2 3 5 8 13을 출력
	static int[] fibo; // 피보나치 수열의 값을 저장할 배열

	public int DFS(int n) {
		if (fibo[n] > 0) { // 이미 계산된 피보나치 수열의 값이 있으면 그 값을 반환
			return fibo[n];
		}
		if (n == 1 || n == 2) { // 피보나치 수열의 첫 번째와 두 번째 값은 1
			return fibo[n] = 1;
		} else {
			// 재귀적으로 (n-2)번째와 (n-1)번째 값을 호출하여 합친다.
			// 그 결과를 fibo 배열에 저장하고 반환
			return fibo[n] = DFS(n - 2) + DFS(n - 1);
		}
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
