package oct08;

import java.util.Scanner;

public class Exam08 {

    public int solution(int n) {
        int result = 0;
        if (n < 12) {
            if (n % 5 == 0) { //10, 5
                result = n / 5;
            } else if (n % 5 == 1) { //11,6
                result = n / 5 + 1;
            } else if (n == 7 || n == 4) {
                result = -1;
            } else if (n % 5 == 3) { //8,3
                result = n / 5 + 1;
            } else { //9
                result = 3;
            }
        } else {
            if (n % 5 == 0) {
                result = n / 5;
            } else if (n % 5 == 1) {
                result = n / 5 + 1;
            } else if (n % 5 == 2) {
                result = n / 5 + 2;
            } else if (n % 5 == 3) {
                result = n / 5 + 1;
            } else if (n % 5 == 4) {
                result = n / 5 + 2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Exam08 exam = new Exam08();
        int result = exam.solution(n);
        System.out.println(result);
    }
}
