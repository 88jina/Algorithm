package nov09;

import java.util.ArrayList;
import java.util.Arrays;

public class Exam04 {

    public static int[] solution(int[] numbers) {


        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            int temp = 0;
            for (int j = 1; j < numbers.length; j++) {
                if (i != j) {
                    temp = numbers[i] + numbers[j];
                    if (!list.contains(temp)) {
                        list.add(temp);
                    }
                }
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 4, 1};
        int[] answer = solution(numbers);

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }

    }
}
