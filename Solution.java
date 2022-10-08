class Solution {
    public String solution(String s, int n) {
        String answer = "";
        int num = 0;

        for(int i=0;i<s.length();i++){

            if(s.charAt(i) == ' '){
                answer += " ";
            }
            else{
                num = s.charAt(i);
                if(num>64 && num<91){
                    num = num+n;
                    while(num>90){
                        num-=26;
                    }
                }
                else if(num>96 && num<123){
                    num = num+n;
                    while(num>122){
                        num-=26;
                    }
                }
                answer += (char)num;
            }
        }
        return answer;
    }
}