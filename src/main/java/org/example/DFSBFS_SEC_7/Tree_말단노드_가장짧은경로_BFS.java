package org.example.DFSBFS_SEC_7;

import java.util.LinkedList;
import java.util.Queue;
class Node {
	int data;
	Node lt, rt;

	public Node(int val) {
		data = val;
		lt = rt = null;
	}
}

public class Tree_말단노드_가장짧은경로_BFS {
	Node root;

	// BFS를 이용해 말단 노드까지의 가장 짧은 경로 찾기
	public int BFS(Node root) {
		Queue<Node> Q = new LinkedList<>(); // 노드들을 저장할 큐
		Q.offer(root); // 루트 노드부터 탐색 시작
		int Level = 0; // 루트 노드의 레벨을 0으로 시작

		while (!Q.isEmpty()) { // 큐가 비어있지 않다면 계속 탐색
			int len = Q.size(); // 현재 레벨에 있는 노드의 수
			for (int i = 0; i < len; i++) { // 현재 레벨의 노드들을 모두 탐색
				Node cur = Q.poll(); // 큐에서 노드를 하나씩 꺼냄
				if (cur.lt == null && cur.rt == null) return Level; // 말단 노드에 도달하면 Level 반환
				if (cur.lt != null) Q.offer(cur.lt); // 왼쪽 자식이 있다면 큐에 추가
				if (cur.rt != null) Q.offer(cur.rt); // 오른쪽 자식이 있다면 큐에 추가
			}
			Level++; // 다음 레벨로 이동
		}
		return 0; // 말단 노드를 찾지 못한 경우 0 반환
	}

	public static void main(String[] args) {
		Tree_말단노드_가장짧은경로_BFS tree = new Tree_말단노드_가장짧은경로_BFS();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		System.out.println(tree.BFS(tree.root));
	}
}
