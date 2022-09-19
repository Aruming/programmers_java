class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int num = 0;
        int tmp = x;

        while(tmp!=0){
            num += tmp%10;
            tmp /= 10;
        }

        if(x%num != 0){
            answer = false;
        }

        return answer;
    }
}