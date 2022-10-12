import java.util.Arrays;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        String[] sort = new String[strings.length];

        Arrays.sort(strings);

        for(int i=0;i<sort.length;i++){
            sort[i] = strings[i].substring(n, n+1);
            sort[i] += strings[i];
        }

        Arrays.sort(sort);

        for(int i=0;i<answer.length;i++){
            answer[i] = sort[i].substring(1, sort[i].length());
        }

        return answer;
    }
}