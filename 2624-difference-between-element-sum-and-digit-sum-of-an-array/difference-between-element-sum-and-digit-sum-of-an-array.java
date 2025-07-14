class Solution {
    public int differenceOfSum(int[] nums) {
        int elSum =0;
        int dSum =0;

        for(int temp:nums){
            elSum+=temp;

            while(temp!=0){
                dSum += temp%10;
                temp/=10;
            }
        }
        return elSum-dSum;
    }
}