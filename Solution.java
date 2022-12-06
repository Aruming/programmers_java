import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        int p = 1;
        int turn = 1;
        String startWord = words[0];
        List<String> wordList = new ArrayList<>();

        for(int i=1;i<words.length;i++){
            p++;
            if(p == n+1){
                p=1;
                turn++;
            }

            if(words[i].length() <= 1){
                answer[0] = p;
                answer[1] = turn;
                break;
            }

            if(words[i].equals(startWord)){
                answer[0] = p;
                answer[1] = turn;
                break;
            }

            if(wordList.contains(words[i])){
                answer[0] = p;
                answer[1] = turn;
                break;
            }

            wordList.add(words[i]);

            if(words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)){
                answer[0] = p;
                answer[1] = turn;
                break;
            }
        }

        return answer;
    }
}