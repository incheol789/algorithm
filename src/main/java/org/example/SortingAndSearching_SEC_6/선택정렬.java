package org.example.SortingAndSearching_SEC_6;

import java.util.Scanner;

public class 선택정렬 {
	public int[] solution(int n, int [] arr) {
		for (int i = 0; i < n; i++) {
			int idx = i;
			for (int j = i+1; j < n; j++) {
				if (arr[j] < arr[idx]) idx = j;
			}
			int tmp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = tmp;
		}

		return arr;
	}

	public static void main(String[] args) {
		선택정렬 T = new 선택정렬();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i <n; i++) arr[i] = kb.nextInt();
		for (int x : T.solution(n, arr)) System.out.println(x + " ");
	}
}
