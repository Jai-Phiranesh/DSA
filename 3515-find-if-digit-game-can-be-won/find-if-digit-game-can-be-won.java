class Solution {
    public boolean canAliceWin(int[] nums) {
        int singleSum =0;
        int doubleSum =0;

        for(int temp:nums){
            if(temp<=9){
                singleSum+=temp;
            }
            else{
                doubleSum+=temp;
            }
        }

        if(doubleSum!=singleSum){
            return true;
        }
        return false;
    }
}