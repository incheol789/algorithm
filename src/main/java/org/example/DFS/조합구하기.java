package org.example.DFS;

import java.util.Scanner;

public class 조합구하기 {
	/**
	 * 1부터 N까지 번호가 적힌 구슬이 있다.
	 * 이 중 M개를 뽑는 방법의 수를 출력하는 프로그램을 작성하세요.
	 */
	static int[] combi;
	static int n, m;
	public void DFS(int L, int s) {
		if (L == m) {
			for (int x : combi) System.out.print(x + " ");
			System.out.println();
		}
		else {
			for (int i = s; i <= n; i++) {
				combi[L] = i;
				DFS(L + 1, i + 1);
			}
		}
	}

	public static void main(String[] args) {
		조합구하기 T = new 조합구하기();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		combi = new int[m];
		T.DFS(0, 1);
	}
}
