package nov16;

public class Exam01 {
    public static String solution(String s, int n) {
        String answer = "";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] upper = upperCase.split("");
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String[] lower = lowerCase.split("");

        for (int i = 0; i < s.length(); i++) {
            int index = 0;

            if (Character.isLowerCase(s.charAt(i))) {
                index = lowerCase.indexOf(s.charAt(i));
                answer += lower[(index + n) % 26];
            } else if(Character.isUpperCase(s.charAt(i))) {
                index = upperCase.indexOf(s.charAt(i));
                answer += upper[(index + n) % 26];
            }else{
                answer+=" ";
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("a B z",4));
    }
}
