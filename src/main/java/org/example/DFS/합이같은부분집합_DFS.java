package org.example.DFS;

import java.util.Scanner;

public class 합이같은부분집합_DFS {
	static String answer = "NO"; // 기본적으로 "NO"로 설정하고, 조건에 맞는 부분집합이 있으면 "YES"로 변경
	static int n, total = 0; // n은 배열의 원소 개수, total 은 배열의 전체 합
	boolean flag = false; // 조건에 맞는 부분집합을 찾으면 탐색을 중지위한 플래그

	public void DFS(int Level, int sum, int[] arr) { // DFS 메서드, L은 현재 레벨, sum은 현재까지의 부분집합 합, arr는 주어진 배열
		if (flag) return; // 이미 답을 찾았으면 더 이상 탐색 X
		if (sum > total / 2) return; // 현재 합이 전체 합의 반을 초과하면 더 이상 탐색 X
		if (Level == n) { // 배열의 끝에 도달했을 경우,
			if ((total - sum) == sum) { // 현재까지의 합과 나머지 합이 같으면 정답 처리
				answer = "YES";
				flag = true; // 답을 찾았으므로 탐색을 종료하도록 플래그를 설정
			}
		} else {
			DFS(Level + 1, sum + arr[Level], arr); // 현재 원소를 부분집합에 포함시키는 경우
			DFS(Level + 1, sum, arr); // 현재 원소를 부분집합에 포함시키지 않는 경우
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
