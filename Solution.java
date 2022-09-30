class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long pay = 0;

        for(int i=1;i<=count;i++){
            pay += i*price;
        }

        if(money<pay){
            answer = (long)pay-money;
        }
        else{
            answer = 0;
        }


        return answer;
    }
}