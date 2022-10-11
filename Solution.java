class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int tmp = 0;

        for(int i=0;i<sizes.length;i++){
            if(sizes[i][0]>sizes[i][1]){
                tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
        }

        int width = sizes[0][0];
        int height = sizes[0][1];
        for(int i=0;i<sizes.length;i++){
            for(int j=0;j<sizes[0].length;j++){
                if(sizes[i][0]>width)
                    width = sizes[i][0];
                if(sizes[i][1]>height)
                    height = sizes[i][1];
            }
        }

        answer = width*height;

        return answer;
    }
}