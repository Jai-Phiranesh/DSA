class Solution {
    public int trap(int[] arr) {
        int n = arr.length;

        int l = 0;
        int r = n-1;
        int leftMax = 0;
        int rightMax = 0;
        int total = 0;
        while(l<=r){
            if(arr[l]<=arr[r]){
                if(leftMax >= arr[l]){
                total+=leftMax-arr[l];
                }
                else{
                    leftMax = arr[l];
                }
                l++;
            }
            else{
                if(rightMax >=arr[r]){
                total+=rightMax-arr[r];
                }
                else{
                    rightMax = arr[r];
                }
                r--;
            }
            
        }
        return total;
    }
}