class Solution {
    static int compute(int[]arr,int k){
        int count =1;
        int sum = 0;

        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]<=k){
                sum+=arr[i];
            }
            else{
                count++;
                sum = arr[i];
            }
        }
        return count;
    }
    public int splitArray(int[] arr, int k) {
        if(arr.length<k){
            return -1;
        }

        int ans =-1;
        int low = Integer.MIN_VALUE;
        int high =0;
        for(Integer t:arr){
            high+=t;
            low = Math.max(low,t);
        }
        while(low<=high){
            int mid=(low+high)/2;

            if(compute(arr,mid)>k){
               
               low = mid+1;
               
            }
            else{
                 ans = mid;
                high =mid-1;
            }
            
        }
        return ans;
    }
}