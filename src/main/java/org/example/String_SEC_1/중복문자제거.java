package org.example.String_SEC_1;

import java.util.Scanner;

class 중복문자제거 {
    /**
     * 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
     * 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
     */
	public String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
        }
		return answer;
	}

	public static void main(String[] args) {
		중복문자제거 T = new 중복문자제거();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));
	}
}
