package oct22;

import java.util.*;

public class Exam06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String test = sc.nextLine();
        test = test.toUpperCase();
        String[] word = test.split("");

        String temp ="";

        for(int i=0; i<word.length;i++){
            if(!temp.contains(word[i])){
                temp+=word[i];
            }
        }
        int[] frequency = new int[temp.length()];
        for(int i=0; i< temp.length();i++){
            String str = temp.substring(i,i+1);
            int num =0;
            for(int j=0; j<word.length;j++){
                if(str.contentEquals(word[j])){
                    num++;
                }
            }
        }
    }
}
