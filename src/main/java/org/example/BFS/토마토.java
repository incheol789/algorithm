package org.example.BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point2{
	public int x, y;
	Point2(int x, int y){
		this.x = x;
		this.y = y;
	}
}
public class 토마토 {
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int[][] board, dis;
	static int n, m;
	static Queue<Point2> Q = new LinkedList<>();

	public void BFS() {

	}

	public static void main(String[] args) {
		토마토 T = new 토마토();
		Scanner kb = new Scanner(System.in);
		m = kb.nextInt();
		n = kb.nextInt();
		board = new int[n][m];
		dis = new int[n][m];
		for (int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				board[i][j] = kb.nextInt();
				if(board[i][j] == 1) Q.offer(new Point2(i, j));
			}
		}
		T.BFS();
		boolean flag = true;
		int answer = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				answer = Math.max(answer, dis[i][j]);
				if(board[i][j] == 0) flag = false;
			}
		}
		if(flag) System.out.println(answer);
		else System.out.println(-1);
	}
}
