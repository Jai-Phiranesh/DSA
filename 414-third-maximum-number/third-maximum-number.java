class Solution {
    public int thirdMax(int[] nums) {
        Integer max = null;
        Integer smax = null;
        Integer tmax = null;

         for(Integer num:nums){
             if (num .equals(max)  || num .equals(smax) || num .equals(tmax)) continue;
            if(max==null||max<num){
                tmax=smax;
                smax=max;
                max=num;

            }
            else if(smax==null||smax<num){
                tmax=smax;
                smax=num;
            }
            else if(tmax==null||tmax<num){
                tmax=num;
            }
           
         }
         if(tmax==null){
            return max;
         }
         return tmax;
    }
}