package oct28;

import java.util.ArrayList;
import java.util.Arrays;

public class Exam02 {

    public static String solution(String encrypted_text, String key, int rotation) {
        String answer = "";
        String alphabet = "abcdefghijklmnopqrstuwvxyz";

        String[] afterRotation = encrypted_text.split("");
        ArrayList<String> afterList = new ArrayList<>(Arrays.asList(afterRotation));
        for (int i = 0; i < rotation; i++) {
            String temp = afterList.get(0);
            afterList.remove(0);
            afterList.add(temp);
        }

        String[] alphabets = alphabet.split("");

        //리스트에서 암호화된 알파벳을 뽑는다
        //해당 알파벳이 키에서 뭔지 확인하고 키와 스트링 알파벳의 인덱스 확
        //스트링 알파벳 인덱스+1만큼 뒤로 가서 원래 알파벳을 찾는다
        String temp = "";
        for (int i = 0; i < key.length(); i++) {
            String encrypted = afterList.get(i); //v
            String keyString = key.substring(i); //


            String origin = "";

        }
        answer = temp;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("qyyigoptvfb", "abcdefghijk", 3));
    }
}
