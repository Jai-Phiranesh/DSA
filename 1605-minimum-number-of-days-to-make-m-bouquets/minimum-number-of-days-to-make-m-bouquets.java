class Solution {
    public boolean compute(int[] bloomDay,int day,int m,int k){
        int count =0;
        int bo =0;

        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=day){
                count++;
            }
            else{
                bo+=(count/k);
                count=0;
            }
        }
         bo+=(count/k);
         return bo>=m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int ans=-1;
        long val = (long) m*k;
        if(val>bloomDay.length){
            return-1;
        }
        for(int i=0;i<bloomDay.length;i++){
            min = Math.min(bloomDay[i],min);
            max = Math.max(bloomDay[i],max);
        }

        while(min<=max){
            int mid = (min+max)/2;
           
            if(compute(bloomDay,mid,m,k)){
                ans = mid;
                max = mid-1;
            }
            else{
                min = mid+1;
            }
        }
        return ans;
    }
}