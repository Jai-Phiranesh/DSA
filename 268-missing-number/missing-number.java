class Solution {
    public int missingNumber(int[] nums) {
        // int n = nums.length;
        // int sum = n*(n+1)/2;
        

        // int s2 = 0;

        // for(int i = 0;i<nums.length;i++){
        //     s2 = s2+nums[i];
        // }
        int xor1 =0;
        int xor2 =0;
        for(int i = 0; i<nums.length;i++){
            xor2 = xor2^nums[i];
            xor1 = xor1^(i+1);
        }
        return xor1^xor2;
        // return sum-s2;
    }
}