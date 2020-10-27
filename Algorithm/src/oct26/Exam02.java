package oct26;

public class Exam02 {
    public static int[] solution(int[] array, int[][] commands) {

        String temp = "";
        for (int i = 0; i < array.length; i++) {
            temp += array[i];
        }

        int[] answer = new int[commands.length];
        int[] tempArr = new int[temp.length()];
        for (int i = 0; i < commands.length; i++) {
            int beginIndex = commands[i][0] - 1;
            int endIndex = commands[i][1]-1;
            int finalIndex = commands[i][2] - 1;
            int num=0;

        }
        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
//        int[][] commands = {{2, 5, 3}};
        int[] answer = solution(array, commands);

        for (int i : answer) {
            System.out.println(i);
        }
    }
}
