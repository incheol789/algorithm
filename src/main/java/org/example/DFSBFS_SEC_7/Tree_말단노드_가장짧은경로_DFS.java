package org.example.DFSBFS_SEC_7;

class Node3 {
	int data;
	Node3 lt, rt;
	public Node3(int val) {
		data = val;
		lt = rt = null;
	}
}

public class Tree_말단노드_가장짧은경로_DFS {
	Node3 root;

	// DFS를 이용하여 말단 노드까지의 가장 짧은 경로 찾기
	public int DFS(int L, Node3 root) {
		if (root.lt == null && root.rt == null) return L; // 말단 노드에 도달하면 레벨 반환
		else {
			// 왼쪽 자식과 오른쪽 자식 중 더 짧은 경로를 가진 노드로 재귀호출
			return Math.min(DFS(L + 1, root.lt), DFS(L + 1, root.rt));
		}
	}

	public static void main(String[] args) {
		Tree_말단노드_가장짧은경로_DFS tree = new Tree_말단노드_가장짧은경로_DFS();
		tree.root = new Node3(1);
		tree.root.lt = new Node3(2);
		tree.root.rt = new Node3(3);
		tree.root.lt.lt = new Node3(4);
		tree.root.lt.rt = new Node3(5);
		System.out.println(tree.DFS(0, tree.root));
	}
}
