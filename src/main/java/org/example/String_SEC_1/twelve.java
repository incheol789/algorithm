package org.example.String_SEC_1;

import java.util.Scanner;

public class twelve {
    /**
     1. “#*****#”를 일곱자리의 이진수로 바꿉니다. #은 이진수의 1로, *이진수의 0으로 변환합니다. 결과는 “1000001”로 변환됩니다.

     2. 바뀐 2진수를 10진수화 합니다. “1000001”을 10진수화 하면 65가 됩니다.

     3. 아스키 번호가 65문자로 변환합니다. 즉 아스크번호 65는 대문자 'A'입니다.

     참고로 대문자들의 아스키 번호는 'A'는 65번, ‘B'는 66번, ’C'는 67번 등 차례대로 1씩 증가하여 ‘Z'는 90번입니다.

     현수가 4개의 문자를 다음과 같이 신호로 보냈다면

     #****###**#####**#####**##**

     이 신호를 4개의 문자신호로 구분하면

     #****## --> 'C'

     #**#### --> 'O'

     #**#### --> 'O'

     #**##** --> 'L'

     최종적으로 “COOL"로 해석됩니다.
     */
    public String solution(int n, String s) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            String tmp = s.substring(0, 7)
                    .replace('#', '1')
                    .replace('*', '0');
            // 2진수 문자열인 tmp를 10진수로 변환하여 num에 저장
            int num = Integer.parseInt(tmp, 2);
            // 아래 코드를 아스키 번호로 간주하고, 해당하는 문자를 answer에 추가
            answer += (char)num;

            // 처리한 7자리를 제외한 나머지 부분을 다시 s에 저장
            s = s.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) {
        twelve T = new twelve();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(n, str));
    }
}
