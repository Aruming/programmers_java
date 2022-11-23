class Solution {
    public String solution(String s) {
        String answer = "";
        String[] words = s.split("");

        for(int i=0;i< words.length;i++){
            words[0] = words[0].toUpperCase();

            if(i>0){
                if(words[i-1].equals(" ")){
                    words[i] = words[i].toUpperCase();
                }else{
                    words[i] = words[i].toLowerCase();
                }
            }
            answer += words[i];
        }
        return answer;
    }
}