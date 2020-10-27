package oct08;

import java.util.Scanner;

public class Exam10 {

    public void solution(int x) {

        String answer = null;
        int i = 0;
        int line = 0;
        while (line < x) {
            i++;
            line = i * (i + 1) / 2;

        }
//        System.out.println("i: "+i);
//        System.out.println("line : "+line);
        int index = line - x;
//        System.out.println("index: "+index);

        if (i % 2 != 0) {
            answer = (index + 1) + "/" + (i - index);
        } else {
            answer = (i - index) + "/" + (index + 1);
        }

        System.out.println(answer);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Exam10 exam = new Exam10();
        exam.solution(x);
    }
}
