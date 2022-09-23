import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;

        String num = Long.toString(n);
        char[] arr = num.toCharArray();

        Arrays.sort(arr);

        num = "";
        for(int i=arr.length;i>0;i--){
            num+=arr[i-1];
        }

        answer = Long.parseLong(num);

        return answer;
    }
}