class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int [] nge = new int[nums.length];

       a: for(int i=0;i<nums.length;i++){

            for(int j=i+1;j<i+nums.length;j++){
                int ind = j%nums.length;
                if(nums[ind]>nums[i]){
                    nge[i]=nums[ind];
                    continue a;
                }
            }
            nge[i]=-1;
        }
        return nge;
    }
}