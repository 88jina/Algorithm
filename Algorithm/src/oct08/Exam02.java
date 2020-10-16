package oct08;

import java.util.*;

public class Exam02 {

	public int solution(int a, int b, int c) {
		int breakEvenPoint = 0;
		
		int n = 1;
		while(a+b*n>c*n) {
			n++;
		}
		breakEvenPoint = n+1;
		return breakEvenPoint;

	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int fc = sc.nextInt();
        int vc = sc.nextInt();
        int sales = sc.nextInt();
		Exam02 exam = new Exam02();
		int point = exam.solution(fc, vc, sales);
		System.out.println(point);
	}
}
