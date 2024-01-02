package org.example.DFS;

import java.util.Scanner;

public class 합이같은부분집합_DFS {
	static String answer = "NO"; // 기본적으로 "NO"로 설정하고, 조건에 맞는 부분집합이 있으면 "YES"로 변경
	static int n, total = 0; // n은 배열의 원소 개수, total 은 배열의 전체 합
	boolean flag = false; // 조건에 맞는 부분집합을 찾으면 탐색을 중지위한 플래그

	public void DFS(int Level, int sum, int[] arr) { // DFS 메서드, L은 현재 레벨, sum은 현재까지의 부분집합 합, arr는 주어진 배열
		if (flag) return;
		if (sum > total / 2) return;
		if (Level == n) {
			if ((total - sum) == sum) {
				answer = "YES";
				flag = true;
			}
		} else {
			DFS(Level + 1, sum + arr[Level], arr);
			DFS(Level + 1, sum, arr);
		}

	}

	public static void main(String[] args) {
		합이같은부분집합_DFS T = new 합이같은부분집합_DFS();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
			total += arr[i];
		}
		T.DFS(0, 0, arr);
		System.out.println(answer);
	}
}
