package org.example.DFSBFS_SEC_7;

import java.util.ArrayList;
import java.util.Scanner;

public class 경로탐색_인접리스트 {
	static int n, m, answer = 0;                   // n: 노드(정점)의 수, m: 간선의 수, answer: 모든 경로의 수
	static ArrayList<ArrayList<Integer>> graph;    // 그래프를 표현하는 인접 리스트
	static int[] ch;                              // 방문한 노드를 체크하는 배열

	// DFS 메소드로 경로 탐색
	public void DFS(int v) {
		// 목적지 노드에 도달한 경우
		if (v == n) {
			// 경로 수 증가
			answer++;
		} else {
			// v에서 갈 수 있는 모든 노드에 대해 탐색
			for (int nv : graph.get(v)) {
				// 아직 방문하지 않았다면
				if (ch[nv] == 0) {
					// 방문 시작
					ch[nv] = 1;
					// 재귀적으로 다음 노드 방문
					DFS(nv);
					// 방문 끝(백트래킹)
					ch[nv] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		경로탐색_인접리스트 T = new 경로탐색_인접리스트();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();                         // 노드의 수 입력 받음
		m = kb.nextInt();                         // 간선의 수 입력 받음
		graph = new ArrayList<>();                // 그래프 초기화
		for (int i = 0; i <= n; i++) {            // 각 노드에 대한 리스트 초기화
			graph.add(new ArrayList<Integer>());
		}
		ch = new int[n + 1];                      // 방문 배열 초기화

		// m개의 간선 정보를 입력받아 그래프 구성
		for (int i = 0; i < m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			graph.get(a).add(b);                  // a 노드에서 b 노드로 가는 경로 추가
		}
		ch[1] = 1;                               // 시작 노드 방문으로 설정
		T.DFS(1);                                // 1번 노드부터 탐색 시작
		System.out.println(answer);              // 경로의 수 출력
	}
}
