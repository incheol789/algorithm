package org.example.hashMapTreeSet_SEC_4;

import java.util.HashMap;
import java.util.Scanner;

public class Main1 {
    public char solution(int n, String s) {
        char answer = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : s.toCharArray()) {
            // 문자열 s를 순회하면서 각 문자의 등장 횟수를 HashMap 에 기록
            // 만약 해당 문자가 이미 HashMap 에 있다면 기존 등장 횟수에 1을 더하고, 없다면 1로 초기화
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) {
            // HashMap 을 순회하면서 가장 많이 등장한 문자 찾기.
            // max 보다 현재 문자의 등장 횟수가 더 크다면 max 와 해당 문자를 갱신
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main1 T = new Main1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(n, str));
    }
}
