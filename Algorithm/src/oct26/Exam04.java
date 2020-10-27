package oct26;

import java.util.ArrayList;

public class Exam04 {

    public static int[] solution(int[] arr) {

        ArrayList<Integer> indexList = new ArrayList<>();
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]==arr[i+1]){
                indexList.add(i);
            }
        }

        int[] answer = new int[arr.length-indexList.size()];
        for(int i=0; i< indexList.size();i++){

        }




        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {4, 4, 4, 3, 3};
        solution(arr);

    }
}
