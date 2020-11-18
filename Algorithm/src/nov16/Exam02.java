package nov16;

import java.util.LinkedList;

public class Exam02 {
    public static int solution(int n) {
        int answer = 0;

        String num="";
        LinkedList stack = new LinkedList();
        while(n>0){
            stack.add(n%3);
            n/=3;
        }
        while(!stack.isEmpty()){
            num+=stack.pollLast();
        }
        String reversed="";
        int number = Integer.parseInt(num);
        while(number>0){
            reversed+=String.valueOf(number%10);
            number/=10;
        }
        answer=Integer.parseInt(reversed,3);

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(125));
    }
}
