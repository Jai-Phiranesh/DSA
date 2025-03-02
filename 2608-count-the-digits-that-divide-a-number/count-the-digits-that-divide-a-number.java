class Solution {
    public int countDigits(int num) {
        int count=0;
        int finalcount=num;

        while(!(num==0)){
            int la=num%10;
            if(finalcount%la==0){
                count++;
            }
            num=num/10;
        }
        return count;
    }
}