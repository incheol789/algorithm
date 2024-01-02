package org.example.DFS;

import java.util.Scanner;

public class 바둑이승차_DFS {
	/**
	 * 철수는 바둑이들을 데리고 시장에 가려고 한다. 그런데 그의 트럭은 C 킬로그램을 넘게 태울 수가 없다.
	 * 철수는 C를 넘지 않으면서 바둑이들을 가장 무겁게 태우고 싶어한다.
	 * N 마리의 바둑이와 각 바둑이의 무게 W이 주어지면,
	 * 철수가 트럭에 태울 수 있는 가장 무거운 무게를 구하는 프로그램을 작성하세요
	 */
	static int answer = Integer.MIN_VALUE, c, n;

	public void DFS(int L, int sum, int[] arr) { // DFS 메소드는 현재 레벨, 현재까지의 무게 합, 바둑이 무게 배열을 매개변수로..
		if (sum > c) return; // 현재 무게 합이 트럭의 최대 무게를 초과하면 더 이상 탐색 X
		if (L == n) { // 모든 바둑이를 고려한 경우,
			answer = Math.max(answer, sum); // 현재 무게 합과 기존의 최대 무게를 비교하여 더 큰 값을 최대 무게로 설정
		} else {
			DFS(L + 1, sum + arr[L], arr); // 현재 바둑이를 트럭에 태우는 경우
			DFS(L + 1, sum, arr); // 현재 바둑이를 트럭에 태우지 않는 경우
		}
	}

	public static void main(String[] args) {
		바둑이승차_DFS T = new 바둑이승차_DFS();
		Scanner kb = new Scanner(System.in);
		c = kb.nextInt();
		n = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		T.DFS(0, 0, arr);
		System.out.println(answer);
	}
}
