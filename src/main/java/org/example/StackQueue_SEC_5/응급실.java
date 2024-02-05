package org.example.StackQueue_SEC_5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person {
	int id;
	int priority;
	public Person(int id, int priority) {
		this.id = id;
		this.priority = priority;
	}
}

public class 응급실 {
	public int solution(int n, int m, int[] arr) {
		int answer = 1;
		Queue<Person> Q = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			Q.offer(new Person(i, arr[i]));
		}
		while (!Q.isEmpty()) {
			Person tmp = Q.poll();
			for (Person x : Q) {
				if (x.priority > tmp.priority) {
					Q.offer(tmp);
					tmp = null;
					break;
				}
			}
			if (tmp != null) {
				answer++;
				if (tmp.id == m) return answer;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		응급실 T = new 응급실();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[m];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
	}
}
