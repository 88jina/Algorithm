package nov09;

public class Exam02 {

    public static long solution(long n) {
        long answer = 0;

        double result = Math.sqrt(n);
        if (result % 1 == 0) {
            answer = (long) Math.pow(result+1, 2);
        } else {
            answer = -1;
        }
        return answer;
    }

    public static void main(String[] args) {
        long ans = solution(3);
        System.out.println(ans);
    }
}
