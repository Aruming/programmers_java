class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int x=1;x<=1000000;x++){
            if(n%x==1){
                answer=x;
                break;
            }
        }
        return answer;
    }
}