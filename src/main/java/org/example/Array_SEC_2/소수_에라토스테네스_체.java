package org.example.Array_SEC_2;

import java.util.Scanner;

public class 소수_에라토스테네스_체 {
    /**
     * 소수(에라토스테네스 체)
     * 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
     * 만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
     * 첫 줄에 소수의 개수를 출력합니다.
     */
    public int solution(int n) {
        int answer = 0;
        int[] ch = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            if (ch[i] == 0) {
                answer++;
                for (int j = i; j <= n; j = j + i) {
                    ch[j] = 1;
                }
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        소수_에라토스테네스_체 T = new 소수_에라토스테네스_체();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }

}
