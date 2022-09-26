class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int num = arr[0];
        int cnt = 0;

        if (arr.length > 1) {
            answer = new int[arr.length - 1];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < num) {
                    num = arr[i];
                }
            }

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == num)
                    continue;
                else {
                    answer[cnt] = arr[i];
                    cnt++;
                }
            }
        } else {
            answer = new int[1];
            answer[0] = -1;
        }

        return answer;
    }
}