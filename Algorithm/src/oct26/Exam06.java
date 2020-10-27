package oct26;

public class Exam06 {

    public static boolean solution(int x) {
        boolean answer = true;

        int primary = x;


        int sum=0;
        while(x>0){
            sum+=x%10;
            x/=10;
        }

        answer = (primary%sum==0) ? true: false;
        return answer;
    }

    public static void main(String[] args) {
        solution(10);
    }
}
