class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pnum = 0;
        int ynum = 0;

        s = s.toLowerCase();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='p'){
                pnum++;
            }
            if(s.charAt(i)=='y'){
                ynum++;
            }
        }

        if(pnum==ynum){
            answer = true;
        }
        else{
            answer = false;
        }

        return answer;
    }
}