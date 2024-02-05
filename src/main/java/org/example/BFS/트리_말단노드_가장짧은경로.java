package org.example.BFS;

import java.util.LinkedList;
import java.util.Queue;

class Node2 {
	int data;
	Node lt, rt;
	public Node2(int val) {
		data = val;
		lt = rt = null;
	}
}

public class 트리_말단노드_가장짧은경로 {
	Node root;
	public int BFS(Node root) {
		Queue<Node> Q = new LinkedList<>();
		Q.offer(root);
		int L = 0;
		while (!Q.isEmpty()) {
			int len = Q.size();
			for (int i = 0; i < len; i++) {
				Node cur = Q.poll();
				if (cur.lt == null && cur.rt == null) return L;
				if (cur.lt != null) Q.offer(cur.lt);
				if (cur.rt != null) Q.offer(cur.rt);
			}
			L++;
		}
		return 0;
	}

	public static void main(String[] args) {
		트리_말단노드_가장짧은경로 tree = new 트리_말단노드_가장짧은경로();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		System.out.println(tree.BFS(tree.root));
	}
}
