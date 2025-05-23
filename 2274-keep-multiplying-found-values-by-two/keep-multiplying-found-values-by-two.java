class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        for(int temp : nums){
            if(temp==original){
                original = temp *2;
            }
        }
        return original;
    }
}