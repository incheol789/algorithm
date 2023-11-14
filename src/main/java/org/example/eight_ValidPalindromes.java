package org.example;

import java.util.Scanner;

/**
 * 유효한 펠린드롬
 */
public class eight_ValidPalindromes {
    public String solution(String s) {
        String answer = "NO";
        s = s.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(s).reverse().toString();
        if (s.equals(tmp)) answer = "YES";
        return answer;
    }

    public static void main(String[] args) {
        eight_ValidPalindromes T = new eight_ValidPalindromes();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(T.solution(str));
    }
}
