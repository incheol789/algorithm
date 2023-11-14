package org.example;

import java.util.Scanner;

/**
 * 중복 문자 제거
 */
class six_RemoveDuplicateCharacters {
    public String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            //System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
            if (str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        six_RemoveDuplicateCharacters T = new six_RemoveDuplicateCharacters();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
