package org.example.DFSBFS_SEC_7;

public class 재귀함수_스택프레임 {
	/**
	 * 자연수 N이 입력되면 재귀함수를 이용하여 1부터 N까지 출력하는 프로그램을 작성하세요.
	 * 이 함수는 주어진 수 n부터 1까지 거꾸로 출력합니다.
	 */
	public void DFS(int n) {
		if (n == 0) {
			return; // 기저 조건: n이 0이면 함수를 끝냅니다.
		} else {
			DFS(n - 1); // 재귀 호출: n에서 1을 빼고 함수를 다시 호출합니다.
			System.out.print(n + " "); // n 값을 출력합니다.
		}
	}

	public static void main(String[] args) {
		재귀함수_스택프레임 T = new 재귀함수_스택프레임();
		T.DFS(3);
	}
}
