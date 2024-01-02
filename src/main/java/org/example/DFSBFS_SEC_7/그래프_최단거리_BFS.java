package org.example.DFSBFS_SEC_7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 그래프_최단거리_BFS {
	/**
	 * 1번 정점에서 각 정점으로 가는 최소 간선수를 2번 정점부터 차례대로 출력하시오.
	 */
	static int n, m;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch, dis;

	public void BFS(int v) {
		Queue<Integer> queue = new LinkedList<>();
		ch[v] = 1; // 시작 정점 방문 체크
		dis[v] = 0; // 시작 정점 거리 = 0
		queue.offer(v); // 시작 정점을 큐에 넣기

		while (!queue.isEmpty()) {
			int cv = queue.poll(); // 큐에서 정점을 하나씩 꺼내기
			for (int nv : graph.get(cv)) { // 꺼낸 정점에 인접한 모든 정점에 대해 반복
				if (ch[nv] == 0) { // 아직 방문하지 않은 정점이라면,
					ch[nv] = 1; // 방문했다고 체크
					queue.offer(nv); // 해당 정점을 큐에 넣기
					dis[nv] = dis[cv] + 1; // 이전 정점의 거리에서 1을 더해 현재 정점의 거리를 계산
				}
			}
		}
	}

	public static void main(String[] args) {
		그래프_최단거리_BFS T = new 그래프_최단거리_BFS();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		ch = new int[n + 1];
		dis = new int[n + 1];
		for (int i = 0; i < m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			graph.get(a).add(b);
		}
		T.BFS(1);
		for (int i = 2; i <= n; i++) {
			System.out.println(i + " : " + dis[i]);
		}
	}
}
