class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int carpetSize = brown + yellow;

        for(int i=1; i<=carpetSize; i++){
            int row = i;
            int col = 0;
            if(carpetSize%row == 0){
                col = carpetSize/row;
            }

            if(row>col) continue;

            if((row-2)*(col-2) == yellow){
                answer[0] = col;
                answer[1] = row;
            }

        }

        return answer;
    }
}