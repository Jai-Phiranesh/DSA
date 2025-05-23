class Solution {
    public int maxProduct(int n) {
       
        int firstMax = Integer.MIN_VALUE;
         int secondMax = Integer.MIN_VALUE;
        while(n>0){
           int temp=n%10;

           if(temp>firstMax){
                secondMax=firstMax;
                firstMax = temp;
           }
           else if(temp>secondMax){
            secondMax=temp;
           }
           n=n/10;
        }
        return firstMax*secondMax;
    }
}