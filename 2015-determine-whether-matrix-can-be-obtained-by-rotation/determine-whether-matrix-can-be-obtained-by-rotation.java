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
    }

    public boolean equals(int[][] mat, int[][] target){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]!=target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean findRotation(int[][] mat, int[][] target) {

        if(equals(mat,target)){
            return true;
        }

        for(int i=0;i<4;i++){
            rotate(mat);
            if(equals(mat,target)){
            return true;
        }
        }
        return false;
    }
}