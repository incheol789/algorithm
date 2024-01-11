package org.example.DFS;

import java.util.Scanner;

public class 조합수_메모이제이션 {
	int[][] dy = new int[35][35];
	public int DFS(int n, int r) {
		if (dy[n][r] > 0) return dy[n][r];
		if (n == r || r == 0) return 1;
		else return dy[n][r] = DFS(n - 1, r- 1) + DFS(n - 1, r);
	}

	public static void main(String[] args) {
		조합수_메모이제이션 T = new 조합수_메모이제이션();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int r = kb.nextInt();
		System.out.println(T.DFS(n, r));
	}
}
