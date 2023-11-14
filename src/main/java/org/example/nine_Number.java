package org.example;

import java.util.Scanner;

public class nine_Number {
    public int solution(String s) {
//        int answer = 0;
//        for (char x : s.toCharArray()) {
//            if (x >= 48 && x <= 57) {
//                answer = answer * 10 + (x - 48);
//            }
//        }

        String answer = "";
        for (char x : s.toCharArray()) {
            // x가 숫자면
            if (Character.isDigit(x)) {
                answer += x;
            }
        }

        return Integer.parseInt(answer);
    }

    public static void main (String[] args) {
        nine_Number T = new nine_Number();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
