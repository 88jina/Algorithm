package oct08;

import java.util.Scanner;

public class Exam05 {
    public static void main(String[] args) {
        String test ="abcdefghijklmnopqrstuvwxyz";
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] arr = test.split("");

        for(int i=0;i< arr.length; i++){
            int index = s.indexOf(arr[i]);
            System.out.printf("%d ",index);
        }
    }
}
