package org.example.DFSBFS_SEC_7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 송아지찾기_상태트리탐색_BFS {
	int answer = 0;
	int[] dis = {1, -1, 5};
	int[] ch;
	Queue<Integer> Q = new LinkedList<>();
	public int BFS(int s, int e) {
		ch = new int[10001];
		ch[s] = 1; // 출발지점
		Q.offer(s);
		int Level = 0;
		while (!Q.isEmpty()) {
			int len = Q.size();
			for (int i = 0; i < len; i++) {
				int x = Q.poll();
				for (int j = 0; j < 3; j++) { // {1, -1, 5} 각각 하나씩 접근
					int nx = x + dis[j]; // 5+1 / 5-1 / 5+5
					if (nx == e) return Level+1; // 송아지 위치를 찾으면 리턴
					if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {
						ch[nx] = 1;
						Q.offer(nx);
					}
				}
			}
			Level++;
		}
		return 0;
	}

	public static void main(String[] args) {
		송아지찾기_상태트리탐색_BFS T = new 송아지찾기_상태트리탐색_BFS();
		Scanner kb = new Scanner(System.in);
		int s = kb.nextInt();
		int e = kb.nextInt();
		System.out.println(T.BFS(s, e));
	}
}
