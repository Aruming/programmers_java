import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};

        int capacity = 1;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1])
                continue;
            else
                capacity++;
        }

        answer = new int[capacity];
        answer[0] = arr[0];
        capacity = 0;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                capacity++;
                answer[capacity] = arr[i+1];
            }
            else{
                continue;
            }
        }

        return answer;
    }
}