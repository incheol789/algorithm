package org.example.Array_SEC_2;

import java.util.Scanner;

public class seven {
    /**
     점수 계산
     */
    public int solution(int n, int[] arr) {
        int answer = 0, cnt = 0;
        for (int i = 0; i < n; i++) {
            // 현재 배열의 값이 1인 경우 실행
            if (arr[i] == 1) {
                // 현재까지 연속된 1의 개수를 1 증가시키기
                cnt++;
                // 현재까지의 연속된 1의 개수에 따라 값을 누적.
                // (즉, 현재까지 연속된 1의 개수만큼을 더하기
                answer += cnt;

            // 현재 배열의 값이 1이 아닌 경우 실행
            } else {
                // 연속된 1의 개수를 초기화
                cnt = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        seven T = new seven();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.print(T.solution(n, arr));
    }
}
