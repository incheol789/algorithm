package org.example.DFSBFS_SEC_7;

public class 재귀함수_스택프레임 {
	/**
	 * 자연수 N이 입력되면 재귀함수를 이용하여 1부터 N까지 출력하는 프로그램을 작성하세요.
	 */
	public void DFS(int n) {
		if (n == 0) {
			return;
		} else {
			DFS(n - 1);
			System.out.print(n + " ");
		}

	}

	public static void main(String[] args) {
		재귀함수_스택프레임 T = new 재귀함수_스택프레임();
		T.DFS(3);
	}
}
