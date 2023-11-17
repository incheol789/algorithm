package org.example.Array;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class three {

    public String solution(int n, int[] a, int[] b){
        String answer="";

        for(int i=0; i<n; i++){
            // A가 낸 것과 B가 낸 것이 같으면 비겼으므로 "D"를 추가
            if(a[i]==b[i]) answer+="D";

            // A가 가위(1)이고 B가 보(3)이면 A가 이겼으므로 "A"를 추가
            else if(a[i]==1 && b[i]==3) answer+="A";

            // A가 바위(2)이고 B가 가위(1)이면 A가 이겼으므로 "A"를 추가
            else if(a[i]==2 && b[i]==1) answer+="A";

            // A가 보(3)이고 B가 바위(2)이면 A가 이겼으므로 "A"를 추가
            else if(a[i]==3 && b[i]==2) answer+="A";

            // 위의 조건에 해당하지 않으면 B가 이겼으므로 "B"를 추가
            else answer+="B";
        }
        return answer;
    }

    public static void main(String[] args){
        three T = new three();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0; i<n; i++){
            a[i]=kb.nextInt();
        }
        for(int i=0; i<n; i++){
            b[i]=kb.nextInt();
        }
        for(char x : T.solution(n, a, b).toCharArray()) System.out.println(x);
    }

}
