package oct08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Exam06 {
    public int[] solution(int[] numbers) {
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j) {
                    sum = numbers[i] + numbers[j];
                    list.add(sum);
                }
            }
        }
        HashSet<Integer> hashSet = new HashSet<>(list);
        Object[] objAnswer = hashSet.toArray();
        Integer[] intAnswer = Arrays.copyOf(objAnswer, objAnswer.length, Integer[].class);
        int[] answer = new int[intAnswer.length];
        for (int i = 0; i < intAnswer.length; i++) {
            answer[i] = intAnswer[i].intValue();
        }


        return answer;
    }

    public static void main(String[] args) {
        Exam06 exam = new Exam06();
        int[] numbers ={2,1,3,4,1};
        int[] answers = exam.solution(numbers);
        for(int i=0; i<answers.length;i++){
            System.out.println(answers[i]);
        }
    }
}
