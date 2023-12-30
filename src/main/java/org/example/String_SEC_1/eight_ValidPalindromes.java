package org.example.String_SEC_1;

import java.util.Scanner;

public class eight_ValidPalindromes {
    /**
     앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.

     문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.

     단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.

     알파벳 이외의 문자들의 무시합니다.

     대소문자를 무시하고 알파벳 문자만을 고려하여 주어진 문자열이 회문(Palindrome)인지 여부를 확인하는 함수
     */
    public String solution(String s) {
        String answer = "NO";

        // 주어진 문자열 s를 모두 대문자로 변환하고, 알파벳 이외의 문자를 모두 제거합
        // 따라서 이 시점에서 s는 알파벳 대문자만 포함됨.
        s = s.toUpperCase().replaceAll("[^A-Z]", "");

        // 알파벳 대문자로 이루어진 문자열 s를 뒤집어서 tmp에 저장
        String tmp = new StringBuilder(s).reverse().toString();

        // 만약 원래 문자열 s와 뒤집은 문자열 tmp이 같다면 (회문의 조건), answer를 "YES"로 업데이트
        if (s.equals(tmp)) {
            answer = "YES";
        }
        return answer;
    }

    public static void main(String[] args) {
        eight_ValidPalindromes T = new eight_ValidPalindromes();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(T.solution(str));
    }
}
