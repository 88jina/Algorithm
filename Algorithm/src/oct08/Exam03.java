package oct08;


import java.util.LinkedList;
import java.util.Scanner;

public class Exam03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;

        LinkedList<Integer> qu = new LinkedList<>();
        do {
            a = sc.nextInt();
            b = sc.nextInt();
            int addResult = a + b;
            qu.add(addResult);

        } while (a != 0 && b != 0);

        while (qu.peek() != 0) {
            System.out.println(qu.poll());
        }
    }
}
