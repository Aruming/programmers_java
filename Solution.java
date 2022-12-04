class Solution {
    public int solution(int n) {
        int answer = 0;

        int n_cnt = Integer.bitCount(n);
        int cnt = 0;

        while (true){
            n++;
            cnt = Integer.bitCount(n);

            if(cnt == n_cnt){
                answer = n;
                break;
            }
        }

        return answer;
    }
}