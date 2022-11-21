import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";

        String[] nums = s.split(" ");
        int[] nums_ = new int[nums.length];

        for (int i=0;i<nums.length;i++){
            nums_[i] = Integer.parseInt(nums[i]);
        }

        Arrays.sort(nums_);

        answer += nums_[0] + " " + nums_[nums_.length-1];

        return answer;
    }
}