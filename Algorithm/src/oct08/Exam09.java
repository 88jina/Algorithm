package oct08;

import java.util.Scanner;

public class Exam09 {

    public int solution(int n){

        int count=1;
        int index=0;

        do {
            for(int i=0; i<n; i++){
                count+=6*i;
                index=i;
            }
        }while(count>n);

        return index+1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Exam09 exam = new Exam09();
        int result = exam.solution(n);
        System.out.println(result);
    }

}
