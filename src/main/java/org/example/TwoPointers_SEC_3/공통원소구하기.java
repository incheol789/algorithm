package org.example.TwoPointers_SEC_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 공통원소구하기 {
	/**
	 * A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.
	 */
	public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
		ArrayList<Integer> answer = new ArrayList<>();
		Arrays.sort(a);
		Arrays.sort(b);
		int p1 = 0, p2 = 0;
		while (p1 < n && p2 < m) {
			if (a[p1] == b[p2]) {
				answer.add(a[p1]);
				p2++;
			}
			else if (a[p1] < b[p2]) p1++;
			else p2++;
		}
		return answer;
	}

	public static void main(String[] args) {
		공통원소구하기 T = new 공통원소구하기();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = kb.nextInt();
		}
		int m = kb.nextInt();
		int[] b = new int[m];
		for (int i = 0; i < m; i++) {
			b[i] = kb.nextInt();
		}
		for (int x : T.solution(n, m, a, b)) System.out.print(x + " ");
	}
}
