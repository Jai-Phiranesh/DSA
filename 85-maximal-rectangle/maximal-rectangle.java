class Solution {
    private int areaHistogram(int heights[]){
        Stack<Integer> st = new Stack<>();
        int max = 0;

        for(int i=0;i<heights.length;i++){
             while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                int element =st.pop();
                int nse = i;
                int pse = st.isEmpty() ? -1 : st.peek();
                 max = Math.max(max,heights[element]*(nse-pse-1));
             }
              st.push(i);
        }
         while(!st.isEmpty()){
            int element = st.pop();
                int nse = heights.length;
                int pse = st.isEmpty() ? -1 : st.peek();
                max = Math.max(max,heights[element]*(nse-pse-1));
        }
        return max;
    }
    public int maximalRectangle(char[][] matrix) {
        int max = Integer.MIN_VALUE;

        int[][] prefix = new int[matrix.length][matrix[0].length];

        for(int  i = 0; i<matrix.length; i++){
            for(int  j = 0; j<matrix[0].length; j++){
                if(matrix[i][j]=='1'){
                     prefix[i][j] = (i == 0) ? 1 : prefix[i-1][j] + 1;
                }
               else{
                    prefix[i][j] = 0;
                }
            } 
        }

        for(int i=0;i<matrix.length;i++){
             
            max = Math.max(max,areaHistogram(prefix[i]));
        }

        return max;
    }
}