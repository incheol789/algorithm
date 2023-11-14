package org.example;

import java.util.Scanner;

/**
 * 회문 문자열
 */
class sev_PalindromeString {
    public String solution(String str) {
        String answer = "YES";
        str = str.toUpperCase();
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) answer = "NO";
        }
        return answer;
    }

    public static void main(String[] args) {
        sev_PalindromeString T = new sev_PalindromeString();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
