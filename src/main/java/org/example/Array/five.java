package org.example.Array;

import java.util.Scanner;

public class five {
    /**
     * 소수(에라토스테네스 체)
     * 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
     * 만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
     * 첫 줄에 소수의 개수를 출력합니다.
     */

    public int solution(int n) {
        int answer = 0;
        // 소수 여부를 체크하는 배열. 길이는 n + 1이고, 모든 원소는 초기에 0으로 설정
        int[] ch = new int[n + 1];
        // 2부터 N 까지의 숫자에 대해 반복
        for (int i = 2; i < n; i++) {
            // 현재 숫자 i가 소수인지 확인. (ch[i]가 0이면 소수)
            if (ch[i] == 0) {
                answer++;
                // 현재 소수 i의 배수들을 모두 찾아내기 위한 루프
                for (int j = i; j <= n; j = j + i) {
                    // i의 배수이므로 소수가 아니라고 표시. (체크 배열의 값을 1로 변경)
                    ch[j] = 1;
                }
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        five T = new five();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }

}
