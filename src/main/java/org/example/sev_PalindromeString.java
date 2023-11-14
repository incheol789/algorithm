package org.example;

import java.util.Scanner;

/**
 * 회문 문자열
 */
class sev_PalindromeString {
    public String solution(String str) {
        String answer = "NO";
//        int len = str.length();
//        for (int i = 0; i < len / 2; i++) {
//            /**
//             * 0 != 4 - 0 - 1
//             * 1 != 4 - 1 - 1
//             * 2 != 4 - 2 - 1
//             */
//            if (str.charAt(i) != str.charAt(len - i - 1)) {
//                return "NO";
//            }
//        }

        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(tmp)) {
            answer = "YES";
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
