class Solution {
    int max(int arr[]){
        int max= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max = Math.max(arr[i],max);
        }
        return max;
    }

    int compute(int[] arr,int hour){
        int total =0;

        for(int i=0;i<arr.length;i++){
            total+= ((double)arr[i] + hour - 1) / hour;
        }
        return total;
    }


    public int minEatingSpeed(int[] arr, int h) {
        int low = 1;
        int high = max(arr);
        int ans = Integer.MAX_VALUE;

        while(low<=high){
            int mid = (low+high)/2;
            int val = compute(arr,mid);

            if(val<=h){
                ans=mid;
                high = mid-1;
            }
            else{
            low = mid+1;
            }
        }
        return ans;
    }
}