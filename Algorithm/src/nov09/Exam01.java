package nov09;

import java.util.Arrays;
import java.util.Collections;

public class Exam01 {

    public static long solution(long n) {
        long answer = 0;

        String num = Long.toString(n);
        String[] arr = num.split("");
        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            System.out.println(
                    "내림차순 확인 : " + arr[i]);
        }
        String temp = "";
        for (int i = 0; i < arr.length; i++) {
            temp +=arr[i];
        }

        answer=Long.parseLong(temp);

        return answer;
    }

    public static void main(String[] args) {
        long ans= solution(118372);
        System.out.println("result : "+ans);
    }

}
