package oct26;

public class Exam05 {

    public static boolean solution(String s){
        boolean answer = false;

        s= s.toLowerCase();
        int pCount=0;
        int yCount=0;
        String[] words = s.split("");
        for(String str : words){
            if(str.equals("p")){
                pCount++;
            }else if(str.equals("y")){
                yCount++;
            }
        }
        if(pCount==yCount){
            answer=true;
        }

        return answer;
    }
}
