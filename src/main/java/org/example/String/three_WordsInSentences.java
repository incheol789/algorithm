package org.example.String;

import java.util.*;

/**
 * 문장 속 단어
 */
class three_WordsInSentences {
    public String solution(String str) {
        String answer = "";

        // 1. 문자열 중 가장 긴 단어의 길이를 저장할 변수 m을 선언하고, pos 변수를 초기화.
        // Integer.MIN_VALUE는 가장 작은 정수값으로 초기화되어있다.
        int m = Integer.MIN_VALUE, pos;

        // 공백 문자(' ')를 기준으로 문자열을 분할하는 루프를 시작.
        // indexOf 메소드는 주어진 문자 또는 문자열이 처음 나타나는 위치의 인덱스를 반환하며,
        // 만일 찾는 문자 또는 문자열이 없으면 -1을 반환
        // 따라서 -1이 아닌 동안 새로운 단어를 찾아서 처리
        while ((pos = str.indexOf(' ')) != -1) {
            // 현재 단어를 공백 이전까지의 부분 문자열로 추출하여 tmp에 저장
            String tmp = str.substring(0, pos);
            // 현재 단어의 길이를 계산하여 len에 저장
            int len = tmp.length();
            // 현재 단어의 길이가 기존에 저장된 가장 긴 단어의 길이보다 크면,
            // m을 갱신하고 answer에 현재 단어를 저장
            if (len > m) {
                m = len;
                answer = tmp;
            }
            // 처리한 단어 이후의 부분 문자열을 새로운 str로 갱신
            str = str.substring(pos + 1);
        }
        // 마지막 단어가 있는 경우, 이 단어의 길이가 가장 긴 경우인지 확인하고, answer를 갱신
        if (str.length() > m) answer = str;
        return answer;
    }

    public static void main(String[] args) {
        three_WordsInSentences T = new three_WordsInSentences();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(T.solution(str));
    }
}