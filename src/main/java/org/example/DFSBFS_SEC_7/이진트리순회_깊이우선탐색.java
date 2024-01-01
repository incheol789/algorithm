package org.example.DFSBFS_SEC_7;
// 노드 클래스
class Node1 {
	int data; // 노드가 저장할 데이터
	Node1 lt, rt; // 왼쪽 자식(left)과 오른쪽 자식(right) 노드를 가리키는 포인터

	// 노드 생성자
	public Node1(int val) {
		data = val; // 노드에 데이터 저장
		lt = rt = null; // 처음에는 자식 노드가 없으므로 null로 초기화
	}
}

// 이진 트리 깊이우선탐색 클래스
public class 이진트리순회_깊이우선탐색 {
	Node1 root; // 트리의 루트 노드

	// DFS 메소드
	public void DFS(Node1 root) {
		if (root == null) {
			return; // 기저 조건: 노드가 null이면 더 이상 순회하지 않고 반환
		} else {
			DFS(root.lt); // 왼쪽 자식으로 재귀 호출
			System.out.print(root.data + " "); // 현재 노드의 데이터 출력 (중위 순회: 왼쪽 - 루트 - 오른쪽)
			DFS(root.rt); // 오른쪽 자식으로 재귀 호출
		}
	}

	public static void main(String args[]) {
		이진트리순회_깊이우선탐색 tree = new 이진트리순회_깊이우선탐색();
		tree.root = new Node1(1);
		tree.root.lt = new Node1(2);
		tree.root.rt = new Node1(3);
		tree.root.lt.lt = new Node1(4);
		tree.root.lt.rt = new Node1(5);
		tree.root.rt.lt = new Node1(6);
		tree.root.rt.rt = new Node1(7);
		tree.DFS(tree.root);
	}
}
