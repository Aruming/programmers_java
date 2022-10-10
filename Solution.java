class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int[][] binary1 = new int[n][n];
        int[][] binary2 = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--){
                if(j==0){
                    binary1[i][j] = arr1[i]/2;
                    binary2[i][j] = arr2[i]/2;
                }
                binary1[i][j] = arr1[i]%2;
                arr1[i]/=2;

                binary2[i][j] = arr2[i]%2;
                arr2[i]/=2;
            }
        }

        for(int i=0;i<n;i++){
            answer[i] = "";
            for(int j=0;j<n;j++){
                if(binary1[i][j]==0 && binary2[i][j]==0){
                    answer[i] += " ";
                }
                else{
                    answer[i] += "#";
                }
            }
        }

        return answer;
    }
}