class Solution {
    public void nextPermutation(int[] nums) {
        int ind = -1;
        int n=nums.length;

        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }
        System.out.println(ind);
        if(ind == -1){
            int j=0;
            int k=n-1;
            for(int i=0;i<n;i++){
                if(j>=k){
                    break;
                }
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k]=temp;
                j++;
                k--;
            }
            return;
        }
        else{
            for(int i=n-1;i>ind;i--){
            if(nums[i]>nums[ind]){
                int temp=nums[ind];
                nums[ind]=nums[i];
                nums[i]=temp;
                break;
            }
        }
        }
        int j=ind+1;
        int k=n-1;
        for(int i=0;i<n;i++){
                if(j>=k){
                    break;
                }
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k]=temp;
                j++;
                k--;
            }



        
    }
}