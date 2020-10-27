package oct22;

import java.util.Scanner;

public class Exam03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int sum = 0;
        int avg = 0;
        int overAvg = 0;
        int[] scores = {};
        double ratio = 0.000;
        double[] ratios = new double[testCase];
        for (int i = 0; i < testCase; i++) {
            int studentNum = sc.nextInt();
            scores = new int[studentNum];
            for (int j = 0; j < studentNum; j++) {
                int score = sc.nextInt();

                scores[j] = score;
                sum += score;
            }
            avg = sum / studentNum;
            for (int k = 0; k < studentNum; k++) {
                if (scores[k] > avg) {
                    overAvg++;
                }
            }
            ratio = (double) overAvg / (double) studentNum * 100;
            ratios[i] = ratio;
            sum = 0;
            overAvg = 0;
        }
        for (int l = 0; l < testCase; l++) {
            System.out.println(String.format("%.3f", ratios[l]) + "%");
        }
    }
}
