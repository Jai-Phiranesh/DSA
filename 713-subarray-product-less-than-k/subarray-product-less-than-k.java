class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k==0) return 0;
        int prod = 1;
        int result =0;

        for(int i=0, j=0;j<nums.length;j++){
            prod = prod*nums[j];
            while(prod>=k && i<=j){
                prod/=nums[i];
                i++;
            }
            result+=(j-i)+1;

        }
        return result;
    }
}