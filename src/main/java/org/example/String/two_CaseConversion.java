package org.example.String;

import java.util.Scanner;

public class two_CaseConversion {
    /**
     * 대소문자 변환
     */
    public String solution(String str) {
        String answer = "";

//        public String solution(String str){
//            String answer="";
//            for(char x : str.toCharArray()){
//                if(x>=97 && x<=122) answer+=(char)(x-32);
//                else answer+=(char)(x+32);
//            }
//            return answer;
//        }

        for (char x : str.toCharArray()) {
            if (Character.isLowerCase(x)) answer += Character.toUpperCase(x);
            else answer += Character.toLowerCase(x);

        }
        return answer;
    }

    public static void main(String[] args) {
        two_CaseConversion T = new two_CaseConversion();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
