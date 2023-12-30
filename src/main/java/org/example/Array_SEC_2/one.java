package org.example.Array_SEC_2;

import java.util.ArrayList;
import java.util.Scanner;

public class one {
    /**
     N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
     (첫 번째 수는 무조건 출력한다)
     첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.
     자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
     */
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        // 첫번째 수는 무조건 출력
        answer.add(arr[0]);

        // 배열의 두 번째 원소부터 마지막 원소까지 루프
        for (int i = 1; i < n; i++) {
            // 현재 원소가 이전 원소보다 큰 경우를 확인
            if (arr[i] > arr[i - 1]) {
                // 현재 원소가 이전 원소보다 크다면, 현재 원소를 answer 배열에 추가
                answer.add(arr[i]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        one T = new one();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        for (int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
