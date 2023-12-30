package org.example.DFSBFS_SEC_7;

public class 재귀함수_팩토리얼 {
	/**
	 * 자연수 N이 입력되면 N!를 구하는 프로그램을 작성하세요.
	 * ex) 5! = 5 * 4 * 3 * 2 * 1 = 120
	 */
	public int DFS(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * DFS(n - 1);
		}
	}

	public static void main(String[] args) {
		재귀함수_팩토리얼 T = new 재귀함수_팩토리얼();
		System.out.println(T.DFS(5));
	}
}
