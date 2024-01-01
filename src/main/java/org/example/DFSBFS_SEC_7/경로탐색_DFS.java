package org.example.DFSBFS_SEC_7;

import java.util.Scanner;

public class 경로탐색_DFS {

	static int n, m, answer = 0; // n = 정점의 수, m = 간선의 수, answer = 경로의 수
	static int[][] graph;        // 그래프를 나타내는 인접 행렬
	static int[] ch;             // 노드 방문 여부를 확인하는 배열

	public void DFS(int v) {
		// 현재 노드가 목표(n)에 도달한 경우, 경로 수 증가
		if (v == n) {
			answer++;
		} else {
			// 모든 노드를 탐색
			for (int i = 1; i <= n; i++) {
				// 연결이 있고 해당 노드를 방문하지 않았다면
				if (graph[v][i] == 1 && ch[i] == 0) {
					ch[i] = 1; // 방문으로 표시
					DFS(i);    // 새 노드로 재귀 호출
					ch[i] = 0; // 백트래킹: 다른 경로 탐색을 위해 방문 표시 해제
				}
			}
		}
	}

	public static void main(String[] args) {
		경로탐색_DFS T = new 경로탐색_DFS();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt(); // 정점의 수
		m = kb.nextInt(); // 간선의 수
		graph = new int[n + 1][n + 1];
		ch = new int[n + 1];

		// 간선을 읽고 인접 행렬을 채움
		for (int i = 0; i < m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			graph[a][b] = 1; // a에서 b로 가는 경로가 있음
		}

		ch[1] = 1; // 노드 1부터 시작하므로 방문으로 표시
		T.DFS(1); // 노드 1부터 DFS 시작
		System.out.println(answer); // 노드 1에서 n 까지의 모든 경로의 수 출력
	}
}
