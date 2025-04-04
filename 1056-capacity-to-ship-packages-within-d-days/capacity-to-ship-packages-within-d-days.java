class Solution {
    int compute(int[] arr,int cap){
        int days =1;
        int capa=0;
        for(int i=0;i<arr.length;i++){
            if(capa+arr[i]>cap){
                capa =arr[i];
                days+=1;
            }
            else{
                capa+=arr[i];
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int high=0;
        int low = Integer.MIN_VALUE;
        int ans = -1;
        for(int i=0;i<weights.length;i++){
            high += weights[i];
            low = Math.max(low,weights[i]);
        }
       

        while(low<=high){
            int mid = (low+high)/2;

            int daysc = compute(weights,mid);

            if(daysc<=days){
                high = mid-1;
                ans = mid;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}