class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] temp = new int[n][n];

        for(int i=0;i<matrix.length;i++){

            for(int j=0;j<matrix.length;j++){
                temp[i][j]=matrix[n-j-1][i];
            }

        }

        for(int i=0;i<matrix.length;i++){

            for(int j=0;j<matrix.length;j++){
                matrix[i][j]=temp[i][j];
            }

        }
       
    }
}