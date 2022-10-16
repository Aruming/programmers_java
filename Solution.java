import java.util.Arrays;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};

        int[] arr = new int[numbers.length * (numbers.length-1)];
        int index = 0;

        for(int i=0;i<numbers.length;i++){
            for(int j = 0;j<numbers.length;j++){
                if(i!=j){
                    arr[index] = numbers[i]+numbers[j];
                    index++;
                }
            }
        }

        int[] newArr = Arrays.stream(arr).distinct().toArray();
        Arrays.sort(newArr);

        answer = newArr;

        return answer;
    }
}