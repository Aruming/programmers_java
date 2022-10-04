class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {1, 1};

        int num = n>m?n:m;
        int i=2;

        while(i<num){
            if(n%i==0 && m%i==0){
                answer[0] *= i;
                answer[1] *= i;

                n /= i;
                m /= i;

                i = 2;
            }
            else{
                i++;
            }
        }

        answer[1] *= n*m;

        return answer;
    }
}