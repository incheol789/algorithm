package org.example.String_SEC_1;

import java.util.Scanner;

public class eleven {
    /**
     알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는

     문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.

     단 반복횟수가 1인 경우 생략합니다.
     */
    public String solution(String s) {
        String answer = "";
        // 문자열의 끝에 공백을 추가. 이는 문자열의 마지막 문자까지 처리하기 위함임.
        s = s + " ";
        // 연속으로 반복되는 문자의 개수를 나타내는 변수 cnt를 1로 초기화
        int cnt = 1;

        // 문자열 s를 처음부터 끝까지 순회. (마지막 문자까지 처리하기 위해 길이 - 1까지 순회)
        for (int i = 0; i < s.length() - 1; i++) {
            // 현재 문자와 다음 문자가 같다면 cnt를 증가시키고, 그렇지 않으면 다음과 같이 처리
            if (s.charAt(i) == s.charAt(i + 1)) {
                cnt++;
            } else {
                // 현재 문자를 결과 문자열에 추가
                answer += s.charAt(i); //
                // 만약 연속으로 반복되는 문자의 개수가 1보다 크다면,
                // 개수를 문자열로 변환하여 결과 문자열에 추가하고 cnt를 다시 1로 초기화
                if (cnt > 1) {
                    answer += String.valueOf(cnt);
                    cnt = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        eleven T = new eleven();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
