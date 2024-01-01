package org.example.DFSBFS_SEC_7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 송아지찾기_상태트리탐색_BFS {
	int answer = 0; // 답을 저장할 변수
	int[] dis = {1, -1, 5}; // 이동할 수 있는 거리(1칸 전진, 1칸 후진, 5칸 전진)
	int[] ch; // 방문 체크 배열
	Queue<Integer> Q = new LinkedList<>(); // BFS를 위한 큐

	// BFS를 이용한 최소 이동 횟수 탐색
	public int BFS(int s, int e) {
		ch = new int[10001]; // 방문 체크 배열 초기화
		ch[s] = 1; // 출발 지점 방문 표시
		Q.offer(s); // 출발 지점을 큐에 삽입
		int Level = 0; // 현재 레벨(이동 횟수)

		while (!Q.isEmpty()) { // 큐가 비어있지 않을 때까지 반복
			int len = Q.size(); // 현재 레벨의 위치 개수
			for (int i = 0; i < len; i++) { // 현재 레벨의 모든 위치에 대해
				int x = Q.poll(); // 현재 위치
				for (int j = 0; j < 3; j++) { // 각 이동 경우에 대해
					int nx = x + dis[j]; // 다음 위치 계산
					if (nx == e) return Level+1; // 송아지 위치를 찾으면 현재 레벨 리턴
					if (nx >= 1 && nx <= 10000 && ch[nx] == 0) { // 다음 위치가 유효하고, 아직 방문하지 않았다면
						ch[nx] = 1; // 방문 표시
						Q.offer(nx); // 큐에 삽입
					}
				}
			}
			Level++; // 다음 레벨로 이동
		}
		return 0; // 송아지를 찾지 못했을 경우 0 리턴
	}

	public static void main(String[] args) {
		송아지찾기_상태트리탐색_BFS T = new 송아지찾기_상태트리탐색_BFS();
		Scanner kb = new Scanner(System.in);
		int s = kb.nextInt();
		int e = kb.nextInt();
		System.out.println(T.BFS(s, e));
	}
}
