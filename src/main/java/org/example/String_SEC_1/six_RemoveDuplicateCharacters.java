package org.example.String_SEC_1;

import java.util.Scanner;

/**
 * 중복 문자 제거
 */
class six_RemoveDuplicateCharacters {
    public String solution(String str) {
        String answer = "";
        //  문자열 str을 순회하는 루프를 시작
        for (int i = 0; i < str.length(); i++) {
            // 현재 문자 str.charAt(i)가 처음 등장하는 위치가 현재 인덱스 i와 같다면,
            // 즉, 해당 문자가 현재까지 순회된 부분에서 처음 등장하는 경우에만 실행
            // 이 경우, answer에 해당 문자를 추가
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
