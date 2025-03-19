class Solution {
    public void reverseArray(int[] nums,int i , int j){
        if(i>=j){
            return;
        }
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        reverseArray(nums,i+1,j-1);
    }

    public void rotate(int[] nums, int k) {
            k = k%nums.length;
            reverseArray(nums,0,nums.length-1);
            reverseArray(nums,0,k-1);
            reverseArray(nums,k,nums.length-1);
        
        
        
    }
}