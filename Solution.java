class Solution {
    public int solution(int num) {
        int answer = 0;
        int cnt = 0;
        long n = num;

        if(n==1){
            answer = 0;
        }
        else{
            while(n!=1){
                if(cnt>=500){
                    cnt = -1;
                    break;
                }

                if(n%2==0){
                    n/=2;
                    cnt++;
                }
                else{
                    n = (n*3)+1;
                    cnt++;
                }
            }
            answer = cnt;
        }

        return answer;
    }
}