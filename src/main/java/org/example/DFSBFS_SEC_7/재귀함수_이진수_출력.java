package org.example.DFSBFS_SEC_7;

public class 재귀함수_이진수_출력 {
	/**
	 * 10진수 N이 입력되면 2진수로 변환하여 출력하는 프로그램을 작성하세요.
	 */
	public void DFS(int n) {
		if (n == 0) {
			return;
		} else {
			DFS(n / 2);
			System.out.print(n % 2 + " ");
		}
	}

	public static void main(String[] args) {
		재귀함수_이진수_출력 T = new 재귀함수_이진수_출력();
		T.DFS(11);
	}
}
