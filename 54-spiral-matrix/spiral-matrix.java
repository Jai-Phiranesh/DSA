class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        ArrayList<Integer> ar = new ArrayList<>();
        int n = mat.length;
        int m=mat[0].length;
        int top=0;
        int bottom = n-1;
       int  left =0;
        int right = m-1;

        while(top<=bottom && left<=right){

            for(int i=left;i<=right;i++){
                ar.add(mat[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                ar.add(mat[i][right]);
            }
            right--;

            if(top<=bottom){
                 for(int i=right;i>=left;i--){
                ar.add(mat[bottom][i]);
            }
            bottom--;
            }

             if(left<=right){
                 for(int i=bottom;i>=top;i--){
                ar.add(mat[i][left]);
            }
            left++;            }
           

        }
        return ar;
    }
}