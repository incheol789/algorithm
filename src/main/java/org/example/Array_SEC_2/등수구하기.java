package org.example.Array_SEC_2;

import java.util.Scanner;

public class 등수구하기 {
    /**
     * N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성
     * 같은 점수가 입력 경우 높은 등수로 동일 처리한다. 즉 가장 높은 점수가 92점인데,
     * 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.
     */
    public int[] solution(int n, int[] arr) {
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i]) cnt++;
            }
            answer[i] = cnt;
        }
        return answer;
    }


    public static void main(String[] args) {
        등수구하기 T = new 등수구하기();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        for (int x : T.solution(n, arr)) System.out.print(x + " ");
    }
}
