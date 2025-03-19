class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int concicutive = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                concicutive++;
                System.out.println(concicutive);
            }
            else{
                if(concicutive>max){
                    max = concicutive;
                }   
                concicutive=0;
            }
        }
        if(concicutive>max){
                    max = concicutive;
                }
        return max;
    }
}