class Solution {
    public int searchInsert(int[] arr, int x) {
        int n = arr.length;
        int ans = n;
        int low=0;
        int high =n-1;

        while(low<=high){
            int mid =(low+high)/2;

            if(arr[mid]>=x){
                ans=mid;
                high=mid-1;

            }
            else{
                low=mid+1;
            }
            
        }
        return ans;
    }
}