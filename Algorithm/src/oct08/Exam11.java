package oct08;

import java.util.ArrayList;

public class Exam11 {
    public int[] solution(int[] answers) {


        int[] firstMark = {1, 2, 3, 4, 5};
        int[] secondMark = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] thirdMark = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        ArrayList<Integer> firstList = new ArrayList<>();
        ArrayList<Integer> secondList = new ArrayList<>();
        ArrayList<Integer> thirdList = new ArrayList<>();

        for (int i = 0; i < answers.length; i++) {
            firstList.add(firstMark[i % 5]);
            secondList.add(secondMark[i % 8]);
            thirdList.add(thirdMark[i % 10]);
        }

        int firstScore = 0;
        int secondScore = 0;
        int thirdScore = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == firstList.get(i)) {
                firstScore++;
            }
            if (answers[i] == secondList.get(i)) {
                secondScore++;
            }
            if (answers[i] == thirdList.get(i)) {
                thirdScore++;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        if (firstScore > secondScore && firstScore > thirdScore) {
            list.add(1);

        } else if (secondScore > firstScore && secondScore > thirdScore) {
            list.add(2);
        } else if (thirdScore > firstScore && thirdScore > secondScore) {
            list.add(3);
        } else if (firstScore == secondScore && firstScore > thirdScore) {
            list.add(1);
            list.add(2);
        } else if (firstScore == thirdScore && firstScore > secondScore) {
            list.add(1);
            list.add(3);
        } else if (secondScore == thirdScore && secondScore > firstScore) {
            list.add(2);
            list.add(3);
        } else {
            list.add(1);
            list.add(2);
            list.add(3);
        }
        Object[] objAnswer = list.toArray();
        int[] answer = new int[objAnswer.length];
        for (int i = 0; i < objAnswer.length; i++) {
            answer[i] = (Integer) objAnswer[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Exam11 exam = new Exam11();
        int[] answers = {1, 3, 2, 4, 2};
        int[] ans = exam.solution(answers);

        for (int result : ans) {
            System.out.println(result);
        }
    }

}
