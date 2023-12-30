package org.example.String_SEC_1;

import java.util.Scanner;

public class nine_Number {
    /**
     문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.

     만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.

     추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.

     문자열 s에서 숫자만 추출하여 그 값을 정수로 변환하는 함수입니다.
     */
    public int solution(String s) {
        String answer = "";
        // 문자열 s를 문자 배열로 변환하고 각 문자 x에 대해 반복
        for (char x : s.toCharArray()) {
            // 만약 현재의 문자 x가 숫자인 경우, 해당 숫자를 문자열 answer에 추가
            if (Character.isDigit(x)) {
                answer += x;
            }
        }
        // 문자열 answer를 정수로 변환하여 반환
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        nine_Number T = new nine_Number();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
