class Solution {
    public int solution(int n) {
        int answer = 0;
        int size = 0;
        int tmp = n;

        while(tmp>0){
            tmp /= 3;
            size++;
        }

        int[] ternary = new int[size];
        for(int i=0;i<size;i++){
            if(n==1){
                ternary[i] = 1;
            }
            else{
                ternary[i] = n%3;
                n /= 3;
            }
            System.out.println(ternary[i]);
        }

        int pow = 0;
        for(int i=size-1;i>=0;i--){
            answer += Math.pow(3, pow)*ternary[i];
            pow++;
        }

        return answer;
    }
}