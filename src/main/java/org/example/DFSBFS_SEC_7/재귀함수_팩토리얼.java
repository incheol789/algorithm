package org.example.DFSBFS_SEC_7;

public class 재귀함수_팩토리얼 {
	// 자연수 N이 입력되면 N!을 구하는 프로그램입니다.
	// 예를 들어, 5!은 5 * 4 * 3 * 2 * 1 = 120입니다.
	public int DFS(int n) {
		if (n == 1) { // 재귀 함수의 탈출 조건. n이 1이면 1을 반환
			return 1;
		} else {
			// 재귀 함수를 호출하여 n * (n-1)!을 계산.
			return n * DFS(n - 1);
		}
	}

	public static void main(String[] args) {
		재귀함수_팩토리얼 T = new 재귀함수_팩토리얼();
		System.out.println(T.DFS(5));
	}
}
