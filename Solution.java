class Solution {
    public int[] solution(long n) {
        int i=0;
        long num = n;

        while(num!=0){
            i++;
            num/=10;
        }

        int[] answer = new int[i];

        i=0;
        while(n!=0){
            answer[i] = (int)(n%10);
            n /= 10;
            i++;
        }

        return answer;
    }
}