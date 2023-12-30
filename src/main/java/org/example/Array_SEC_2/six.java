package org.example.Array_SEC_2;

import java.util.ArrayList;
import java.util.Scanner;

public class six {
    /**
     N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
     예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.

     첫 자리부터의 연속된 0은 무시한다.
     첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.
     */
    public boolean isPrime(int num) {
        // 입력된 숫자가 1이면 소수가 아니므로 false 반환
        if (num == 1) {
            return false;
        }
        // 2부터 num-1까지의 숫자로 나누기
        for (int i = 2; i < num; i++) {
            // 나누어 떨어지는 경우가 하나라도 있으면 소수가 아니므로 false 반환
            if (num % i == 0) {
                return false;
            }
        }
        // 위의 경우에 해당하지 않으면 소수이므로 true 반환
        return true;
    }

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            // 현재 숫자를 tmp 에 저장
            int tmp = arr[i];
            // 뒤집은 결과를 저장할 변수인 res 초기화
            int res = 0;
            while (tmp > 0) {
                // tmp 의 일의 자리 숫자 가져오기
                int t = tmp % 10;
                // res 를 10배한 후 일의 자리 숫자를 더한다. 이렇게 하면 숫자가 뒤집힌다.
                res = res * 10 + t;
                // tmp 에서 일의 자리 숫자를 제거
                tmp = tmp / 10;
            }
            // 뒤집은 숫자가 소수인지 isPrime 함수를 통해 확인
            if (isPrime(res)) {
                // 소수이면 결과를 리스트에 추가
                answer.add(res);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        six T = new six();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        for (Integer x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
