import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int cnt = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor == 0)
                cnt++;
        }

        if(cnt==0){
            answer = new int[1];
            answer[0] = -1;
        }
        else{
            answer = new int[cnt];
            cnt = 0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]%divisor == 0){
                    answer[cnt]=arr[i];
                    cnt++;
                }
            }
            Arrays.sort(answer);
        }

        return answer;
    }
}