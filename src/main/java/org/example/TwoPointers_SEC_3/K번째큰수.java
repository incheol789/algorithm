package org.example.TwoPointers_SEC_3;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class K번째큰수 {
	public int solution(int[] arr, int n, int k) {
		int answer = 0;
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int l = j + 1; l < n; l++) {
					Tset.add(arr[i] + arr[j] + arr[l]);
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		K번째큰수 T = new K번째큰수();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(T.solution(arr, n, k));
	}
}
