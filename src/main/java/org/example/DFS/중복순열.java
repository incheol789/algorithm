package org.example.DFS;

import java.util.Scanner;

public class 중복순열 {
	static int[] pm;
	static int n, m;

	public void DFS(int L) {
		if (L == m) {
			for (int x : pm) System.out.print(x + " ");
			System.out.println();
		} else {
			for (int i = 1; i <= n; i++) {
				pm[L] = i;
				DFS(L + 1);
			}
		}
	}

	public static void main(String[] args) {
		중복순열 T = new 중복순열();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		pm = new int[m];
		T.DFS(0);
	}
}
