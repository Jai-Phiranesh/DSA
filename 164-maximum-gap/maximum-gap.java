class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length < 2){
            return 0;
        }
        Arrays.sort(nums);

        int dif = Integer.MIN_VALUE;

        for(int i=0;i<nums.length-1;i++){
            
                int temp =Math.abs(nums[i]-nums[i+1]);
                System.out.println(temp);
                dif = Math.max(dif,temp);
            
        }
        return dif;
    }
}