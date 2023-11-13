package org.example;

import java.util.Scanner;

public class Main {
    /** 문자 찾기
     public int solution(String str, char t) {
     int answer = 0;
     str = str.toUpperCase();
     t = Character.toUpperCase(t);
     for (char x : str.toCharArray()) {
     if (x == t) {
     answer++;
     }
     }
     return answer;
     } */

    /**
     * 대소문자 변환하기1
    public String solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            if (Character.isLowerCase(x)) {
                answer += Character.toUpperCase(x);
            } else {
                answer += Character.toLowerCase(x);
            }
        }
        return answer;
    } */

    /**
     * 대소문자 변환하기2
     */
    public String solution2(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            if (x >= 97 && x <= 122) {
                answer += (char) (x - 32);
            } else {
                answer += (char) (x + 32);
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution2(str));
    }
}