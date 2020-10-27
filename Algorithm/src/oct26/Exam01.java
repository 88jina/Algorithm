package oct26;

public class Exam01 {

    public boolean solution(String s) {

        boolean answer = false;
        if (s.length() == 4 || s.length() == 6) {
            try {
                Integer.parseInt(s);
                answer = true;
            } catch (NumberFormatException e) {

            }
        }

        return answer;
    }
}
