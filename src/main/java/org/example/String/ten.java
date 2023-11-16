package org.example.String;

import java.util.Scanner;

public class ten {
    /**
     한 개의 문자열 s와 문자 t가 주어지면
     문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.

     첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
     문자열의 길이는 100을 넘지 않는다.

     문자열 s와 문자 t가 주어졌을 때, 문자열에서 각 위치까지의 최소 거리를 계산하여 배열에 저장하는 함수
     주어진 문자열과 문자에 대해 각 위치까지의 최소 거리를 계산하여 배열에 담아 반환하자.
     */
    public int[] solution(String s, char t) {
        // 길이가 s의 길이와 같은 정수 배열 answer를 생성. 이 배열은 결과를 저장하는데 사용
        int[] answer = new int[s.length()];

        // 초기 거리를 큰 값인 1000으로 설정
        int p = 1000;

        // 문자열 s를 왼쪽에서 오른쪽으로 순회
        for (int i = 0; i < s.length(); i++) {
            // 현재 위치의 문자가 t와 같다면 거리 p를 0으로 초기화하고, 그렇지 않으면 거리를 증가시킨다.
            if (s.charAt(i) == t) {
                p = 0;
            } else {
                p++;
            }
            // 현재 위치까지의 최소 거리를 배열에 저장
            answer[i] = p;
        }
        // 초기 거리를 다시 1000으로 설정
        p = 1000;
        // 문자열 s를 오른쪽에서 왼쪽으로 순회
        for (int i = s.length() - 1; i >= 0; i--) {
            // 현재 위치의 문자가 t와 같다면 거리 p를 0으로 초기화하고, 그렇지 않으면 거리를 증가시킨 후,
            // 현재 위치의 최소 거리를 계산하여 배열에 저장
            if (s.charAt(i) == t) {
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        ten T = new ten();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        for (int x : T.solution(str, c)) {
            System.out.print(x + " ");
        }
    }
}
