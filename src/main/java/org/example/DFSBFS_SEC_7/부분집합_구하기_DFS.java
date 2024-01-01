package org.example.DFSBFS_SEC_7;

public class 부분집합_구하기_DFS {
	/**
	 * 자연수 N이 주어지면 1부터 N 까지의 원소를 갖는 집합의 부분집합을 모두 출력하는 프로그램을 작성하세요
	 */
	static int n;
	static int[] ch;
	public void DFS(int L) {
		if (L == n + 1) {
			String tmp = "";
			for (int i = 1; i <= n; i++) {
				if (ch[i] == 1) tmp += (i + " ");
			}
			if(tmp.length() > 0) System.out.println(tmp);
		}
		else {
			ch[L] = 1;
			DFS(L + 1);
			ch[L] = 0;
			DFS(L + 1);
		}

	}

	public static void main(String[] args) {
		부분집합_구하기_DFS T = new 부분집합_구하기_DFS();
		n = 3;
		ch = new int[n + 1];
		T.DFS(1);
	}
}
