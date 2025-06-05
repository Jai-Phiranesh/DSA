class Solution {
    public int arraySign(int[] nums) {

        int pro = 1;

        for(int num : nums)
        {
            if(num>0)
            {
                pro*=1;
            }
        else if(num<0){
            pro*=-1;
        }
         else{
            return 0;
         }
        }
        return pro;
        
        
    }
}