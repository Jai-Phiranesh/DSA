class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int small  = nums[0];
        int last  = nums[nums.length-1];

        while(small>0 && last>0){
            if(small>last){
                small=small%last;
            }
             else{
                last=last%small;
            }
        }

        if(small==0){
            return last;
        }
        return small;

    }
}