class Solution {
    public int findNonMinOrMax(int[] nums) {
        
        if(nums.length<=2){
            return -1;
        }
        int min = Integer.MAX_VALUE;
         int max = Integer.MIN_VALUE;
       
        for(int i=0;i<nums.length;i++){
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=max && nums[i]!=min){
                return nums[i];
            }
        }

        return nums[1];
        

       
    }
}