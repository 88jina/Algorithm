package nov09;

public class Exam03 {

    public static String solution(String s) {
        String answer = "";

        String[] arr = s.split("");

        int index = arr.length;
        if(index%2!=0){
            answer=arr[(index-1)/2];
        }else{
            answer=arr[index/2-1]+arr[index/2];
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("qwer"));

    }
}
