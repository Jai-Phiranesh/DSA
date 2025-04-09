class Solution {
    int max(int [][]mat,int n,int m,int col){
        int max =-1;
        int index = -1;

        for(int i=0;i<n;i++){
            if(mat[i][col]>max){
                max=mat[i][col];
                index=i;
            }
        }
        return index;
    }
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int low =0;
        int high =m-1;

        while(low<=high){
            int mid = (low+high)/2;
            int max= max(mat,n,m,mid);
            int left=-1;
            int right =-1;
            if(mid-1>=0){
                left=mat[max][mid-1];
            }
            if(mid+1<m){
                right=mat[max][mid+1];
            }

            if(mat[max][mid]>left&&mat[max][mid]>right){
                int[] result = new int[2];
                result[0]= max;
                result[1]=mid;
                return result;
            }
            else if(mat[max][mid]<left){
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
         int[] result = new int[2];
                result[0]= -1;
                result[1]=-1;
                return result;
    }
}