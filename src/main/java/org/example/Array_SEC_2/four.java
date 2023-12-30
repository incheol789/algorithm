package org.example.Array_SEC_2;

import java.util.Scanner;

public class four {
    /**
     피보나치 수열
     1) 피보나치 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
     2) 입력은 피보나치 수열의 총 항의 수이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
     */

//    public int[] solution(int n) {
//        int[] answer = new int[n];
//        answer[0] = 1;
//        answer[1] = 1;
//        for (int i = 2; i <n; i++) {
//            answer[i] = answer[i-2] + answer[i-1];
//        }
//
//        return answer;
//    }

    // 배열 사용 x (손코딩)
    public void solution(int n) {
        int a = 1, b = 1, c;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            c = (a + b);
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        four T = new four();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        T.solution(n);
    }
}
