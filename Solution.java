import java.util.HashMap;
class Solution {
    public int solution(int[] nums) {
        int answer = 1;
        HashMap<Integer, Integer> type = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(type.containsKey(nums[i])){
                type.put(nums[i], type.get(nums[i])+1);
            }
            else{
                type.put(nums[i], 1);
            }
        }

        if((nums.length / 2) >= type.size()){
            answer = type.size();
        }else{
            answer = nums.length / 2;
        }

        return answer;
    }
}