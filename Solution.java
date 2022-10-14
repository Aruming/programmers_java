import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        int[] sort = {};
        int length = 0;
        int index = 0;
        for(int i=0;i<commands.length;i++){
            if(commands[i][1] == commands[i][0]){
                answer[i] = array[commands[i][0]-1];
            }
            else{
                length = commands[i][1] - commands[i][0] + 1;
                sort = new int[length];

                for(int j= commands[i][0]-1; j<commands[i][1]; j++){
                    sort[index] = array[j];
                    index++;
                }
                Arrays.sort(sort);
                index = 0;

                answer[i] = sort[commands[i][2]-1];
            }
        }

        return answer;
    }
}