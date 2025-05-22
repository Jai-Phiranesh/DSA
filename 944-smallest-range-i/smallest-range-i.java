class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        int temp=k;
        while(!(min==max) && temp!=0){
            min=min+1;
            temp--;
        }

        temp=k;
        while(!(min==max) && temp!=0){
            max=max-1;
            temp--;
        }

        return max-min;
    }
}