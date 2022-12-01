class Solution {
    public int solution(int n) {
        int answer = 0;

        int n0 = 0;
        int n1 = 1;

        for(int i=2;i<=n;i++){
            answer = (n0 + n1) %1234567;

            n0 = n1;
            n1 = answer;
        }

        return answer%1234567;
    }
}