class Solution {
    public int maxSum(int[] nums) {
        
        ArrayList<Integer> ar = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(!ar.contains(nums[i])){
                ar.add(nums[i]);
            }
        }

        int sum = 0;
      

        for(int temp : ar){
            if(temp>0){
                sum+=temp;
            }
        }

        if(sum==0){
           return Collections.max(ar);
        }

        return sum;
    }
}