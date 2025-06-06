class Solution {
        public int count(int[] nums,int k){
        if(k<0) return 0;
        int l =0;
        int r =0;
        int n = nums.length;
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        while(r<n){
            if(map.containsKey(nums[r])){
                map.put(nums[r],map.get(nums[r])+1);
            }
            else{
                map.put(nums[r],1);
            }


            while(map.size()>k){
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0){
                    map.remove(nums[l]);
                }
                l++;
            }
            count = count + (r-l)+1; 
            r++;
        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return count(nums,k) - count(nums,k-1);
    }
}