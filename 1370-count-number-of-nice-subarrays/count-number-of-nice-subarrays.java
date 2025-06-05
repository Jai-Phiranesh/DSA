class Solution {
     public int count(int[] nums,int goal){
        if(goal<0) return 0;
        int l =0;
        int r =0;
        int n = nums.length;
        int count = 0;
        int sum=0;

        while(r<n){
           sum += (nums[r] % 2 == 0)?0 : 1;


            while(sum>goal){
                sum -= (nums[l] % 2 == 0) ? 0: 1;
                l++;
            }
            count=count+(r-l+1);
            r++;
        }
        return count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        int less = count(nums,k);
        int lessthanOne = count(nums,k-1);
        return less-lessthanOne;
    }
}