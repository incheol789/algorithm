package org.example.DFSBFS_SEC_7;

public class 부분집합_구하기_DFS {
	/**
	 * 자연수 N이 주어지면 1부터 N 까지의 원소를 갖는 집합의 부분집합을 모두 출력하는 프로그램을 작성하세요
	 */
	// 주어진 자연수 N에 대해 1부터 N까지의 집합의 부분집합을 모두 출력하는 클래스
	static int n; // 집합의 크기
	static int[] ch; // 각 원소가 부분집합에 포함되는지 체크하는 배열

	// 부분집합을 구하는 함수: DFS 방식을 사용
	public void DFS(int L) {
		if (L == n + 1) { // 만약 모든 원소를 고려한 경우(재귀의 끝)
			String tmp = ""; // 부분집합을 표시하는 문자열
			for (int i = 1; i <= n; i++) { // 각 원소에 대해
				if (ch[i] == 1) tmp += (i + " "); // 원소가 부분집합에 포함되면 문자열에 추가
			}
			if(tmp.length() > 0) System.out.println(tmp); // 부분집합 출력(공집합 제외)
		}
		else {
			ch[L] = 1; // L번째 원소를 부분집합에 포함시키는 경우
			DFS(L + 1); // 다음 원소로 넘어감
			ch[L] = 0; // L번째 원소를 부분집합에 포함시키지 않는 경우
			DFS(L + 1); // 다음 원소로 넘어감
		}
	}

	public static void main(String[] args) {
		부분집합_구하기_DFS T = new 부분집합_구하기_DFS();
		n = 3;
		ch = new int[n + 1];
		T.DFS(1);
	}
}
