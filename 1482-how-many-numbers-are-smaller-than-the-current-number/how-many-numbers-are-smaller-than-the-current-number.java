class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int [] arr = new int[n];
        int value = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(nums[i] > nums[j]){
                    value++;
                }
            }
            arr[i] = value;
            value = 0;
        }
        return arr;
    }
}