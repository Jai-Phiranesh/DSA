class Solution {
    private boolean arraySorted(int[] nums){
        for(int i = 0;i<nums.length-1;i++){
            if(!(nums[i]<=nums[i+1])){
                return false;
            }
        }
        return true;
    }
    public boolean check(int[] nums) {
        boolean flag = arraySorted(nums);
        if(flag) return true;
        for(int i=0;i<nums.length-1;i++){
            int temp = nums[0]; 
            for (int j = 0; j < nums.length - 1; j++) {
                nums[j] = nums[j + 1];
         }
            nums[nums.length - 1] = temp;
            flag = arraySorted(nums);
            if(flag) return true;

        }
        return false;
        
    }
}