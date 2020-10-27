package oct26;

import java.util.ArrayList;

public class Exam04 {

    public static int[] solution(int[] arr) {


        ArrayList<Integer> arrList = new ArrayList<>();
        for (int a : arr) {
            arrList.add(a);
        }

        ArrayList<Integer> indexList = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                indexList.add(i);
            }
        }

        for(int i=indexList.size()-1; i>=0; i--){
            int index = indexList.get(i);
            arrList.remove(index);
        }

        Object[] objAnswer = arrList.toArray();
        int[] answer = new int[objAnswer.length];
        for(int i=0; i< answer.length; i++){
            answer[i]=(Integer)objAnswer[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {4, 4, 4, 3, 3};
        solution(arr);

    }
}
