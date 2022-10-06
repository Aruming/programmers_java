class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        int n=0;

        for(int i=0;i<arr.length;i++){

            if(arr[i].equals(" ")){
                answer += " ";
                n=0;
            }
            else{
                if(n==0 || n%2==0){
                    answer += arr[i].toUpperCase();
                }
                else{
                    answer += arr[i].toLowerCase();
                }
                n++;
            }

        }

        return answer;
    }
}