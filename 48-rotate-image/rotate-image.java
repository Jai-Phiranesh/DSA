class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    

    for(int i=0;i<n;i++){

        int j=0;
        int k=n-1;
        for(int re=0;re<n;re++){
            if(j>=k){
                break;
            }
            int temp = matrix[i][k];
            matrix[i][k]=matrix[i][j];
            matrix[i][j]=temp;
            k--;
        j++;
        
        }
        
    }
}}