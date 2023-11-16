package org.example.String;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 단어 뒤집기
 */
class four_FlipWords {
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        // 문자열 배열 str을 순회
        for (String x : str) {
            // 현재 순회 중인 문자열(x)을 문자 배열(s)로 변환
            char[] s = x.toCharArray();
            // 문자 배열을 뒤집기 위해 사용할 두 개의 인덱스 변수 lt와 rt를 초기화
            // lt는 문자열의 처음, rt는 문자열의 끝을 가리킴
            int lt = 0, rt = x.length() - 1;
            // 문자 배열을 뒤집는 과정. lt와 rt가 교차할 때까지 맨 앞과 맨 뒤의 문자를 서로 교환
            while (lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            // 뒤집어진 문자 배열을 다시 문자열로 변환
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {
        four_FlipWords T = new four_FlipWords();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = kb.next();
        }
        for (String x : T.solution(n, str)) {
            System.out.println(x);
        }
    }
}
