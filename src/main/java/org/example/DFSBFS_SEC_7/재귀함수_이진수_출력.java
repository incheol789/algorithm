package org.example.DFSBFS_SEC_7;

public class 재귀함수_이진수_출력 {
	/**
	 * 10진수 N이 입력되면 2진수로 변환하여 출력하는 프로그램을 작성
	 * 이 함수는 주어진 10진수를 2진수로 변환해서 출력.
	 */
	public void DFS(int n) {
		if (n == 0) {
			return; // 0이면 더 이상 나눌 게 없으니까 리턴
		} else {
			DFS(n / 2); // n을 2로 나눈 몫으로 재귀 호출.
			System.out.print(n % 2 + " "); // n을 2로 나눈 나머지를 출력.
		}
	}

	public static void main(String[] args) {
		재귀함수_이진수_출력 T = new 재귀함수_이진수_출력();
		T.DFS(11);
	}
}
