package oct08;

import java.util.LinkedList;
import java.util.Scanner;

public class Exam04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String quizResult = "";
        String[] arr = {};
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            quizResult = sc.next();
            arr = quizResult.split("X");
            int score=0;
            for(int j=0; j<arr.length; j++){
                int num = arr[j].length();
                int sum = num*(num+1)/2;
                score+=sum;
            }
            list.add(score);
        }
        while (list.peek()!=null){
            System.out.println(list.poll());
        }

    }

}
