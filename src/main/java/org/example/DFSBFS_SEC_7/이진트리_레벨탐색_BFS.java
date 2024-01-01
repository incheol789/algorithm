package org.example.DFSBFS_SEC_7;

import java.util.LinkedList;
import java.util.Queue;

class Node2 {
	int data; // 노드가 저장할 데이터
	Node2 lt, rt; // 왼쪽 자식(left)과 오른쪽 자식(right) 노드를 가리키는 포인터

	public Node2(int val) {
		data = val; // 노드 초기화 시 데이터 저장
		lt = rt = null; // 자식 노드는 초기에 null
	}
}

public class 이진트리_레벨탐색_BFS {
	Node2 root; // 트리의 루트 노드

	// BFS 메소드로 레벨별 노드 데이터 출력
	public void BFS(Node2 root) {
		Queue<Node2> Q = new LinkedList<>(); // BFS를 위한 큐
		Q.offer(root); // 루트 노드를 큐에 삽입
		int L = 0; // 현재 레벨

		while (!Q.isEmpty()) { // 큐가 비어있지 않을 때까지 반복
			int len = Q.size(); // 현재 레벨의 노드 수
			System.out.print(L + " : "); // 레벨 출력
			for (int i = 0; i < len; i++) { // 현재 레벨의 노드들을 모두 처리
				Node2 cur = Q.poll(); // 큐에서 노드를 하나 꺼냄
				System.out.print(cur.data + " "); // 노드의 데이터 출력
				if (cur.lt != null) Q.offer(cur.lt); // 왼쪽 자식이 있다면 큐에 삽입
				if (cur.rt != null) Q.offer(cur.rt); // 오른쪽 자식이 있다면 큐에 삽입
			}
			L++; // 다음 레벨로 이동
			System.out.println(); // 줄바꿈
		}
	}

	public static void main(String args[]) {
		이진트리_레벨탐색_BFS tree = new 이진트리_레벨탐색_BFS();
		tree.root = new Node2(1);
		tree.root.lt = new Node2(2);
		tree.root.rt = new Node2(3);
		tree.root.lt.lt = new Node2(4);
		tree.root.lt.rt = new Node2(5);
		tree.root.rt.lt = new Node2(6);
		tree.root.rt.rt = new Node2(7);
		tree.BFS(tree.root);
	}
}
