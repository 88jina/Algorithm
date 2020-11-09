package oct28;

public class Exam03 {

    public static int solution(int num) {
        int answer = 0;
        int count=0;
        while(true) {
            count++;
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num * 3 + 1;
            }
            if(count>500 || num==1){
                break;
            }
        }
        answer=count;
        if(count>500){
            answer=-1;
        }
        return answer;
    }

    public static void main(String[] args) {
        solution(626331);
    }
}
