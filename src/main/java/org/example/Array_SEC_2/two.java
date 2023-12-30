package org.example.Array_SEC_2;

import java.util.Scanner;

public class two {
    public int solution(int n, int[] arr) {
        // 초기에는 첫 번째 학생은 무조건 보일 수 있으므로 answer를 1로 초기화하고,
        // max에 첫 번째 학생의 키를 저장
        int answer = 1, max = arr[0];

        // 반복문을 시작하며 두 번째 학생부터 마지막 학생까지 확인
        for (int i = 1; i < n; i++) {

            // 현재 학생의 키가 이전까지 확인한 학생 중 가장 큰 키인 max보다 크다면,
            if (arr[i] > max) {
                // 선생님이 볼 수 있는 학생 수를 1 증가시키고, max 값을 현재 학생의 키로 업뎃
                answer++;
                max = arr[i];
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        two T = new two();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, arr));
    }
}
