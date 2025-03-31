class Solution {
    public boolean search(int[] nums, int x) {
        int low = 0;
        int high = nums.length-1;
        boolean ans = false;

        while(low<=high){
            int mid =(low+high)/2;
            if(nums[mid]==x){
                return true;
            }
            if(nums[low]==nums[mid]&& nums[low]==nums[high]){
                low++;
                high--;
                continue;
            }
            if(nums[low]<=nums[mid]){
                if(nums[low]<=x && x<=nums[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
        
        else{
            if(nums[mid]<=x && x<=nums[high]){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
    }
        return ans;
    }
}
