package oct22;

import java.util.Scanner;

public class Exam05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] nums = {a, b};

        for (int i = 0; i < nums.length; i++) {
            int hundreds = nums[i] / 100;
            int tens = nums[i] / 10 - hundreds * 10;
            int units = nums[i] - hundreds * 100 - tens * 10;
            int newNum = units * 100 + tens * 10 + hundreds;
            nums[i] = newNum;
        }

        int max = Math.max(nums[0], nums[1]);
        System.out.println(max);

    }
}
