package oct08;

import java.util.*;

public class Exam01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int result = 0;
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            result = 1;
        }
        System.out.println(result);
    }
}
