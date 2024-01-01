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
	public int BFS(Node root) {
		Queue<Node> Q = new LinkedList<>();
		Q.offer(root);
		int Level = 0;
		while (!Q.isEmpty()) {
			int len = Q.size();
			for (int i = 0; i < len; i++) {
				Node cur = Q.poll();
				if (cur.lt == null && cur.rt == null) return Level;
				if (cur.lt != null) Q.offer(cur.lt);
				if (cur.rt != null) Q.offer(cur.rt);
			}
			Level++;
		}
		return 0;
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
