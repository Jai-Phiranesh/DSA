class Solution {
    public boolean canJump(int[] nums) {
        int maxInd =0;

        for(int i=0;i<nums.length;i++){
            if(i>maxInd) return false;

            maxInd = Math.max((nums[i]+i) , maxInd);
        }
        return true;
    }
}