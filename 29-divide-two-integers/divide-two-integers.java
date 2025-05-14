class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==divisor){
            return 1;
        }

        boolean sign = true;

        if(dividend>=0 && divisor<0) sign=false;
        if(dividend<0 && divisor>=0) sign=false;

        long m = Math.abs((long)dividend);
        long d = Math.abs((long)divisor);
        long quotient =0;

        divisor=Math.abs(divisor);

        while(m>=d){
            int count=0;

            while(m>= (d<<(count+1))){
                count=count+1;
            }

            quotient+=1<<count;
            m-=(d<<count);
        }

        if(quotient == (1<<31) && sign){
            return Integer.MAX_VALUE;
        
        }
        if(quotient == (1<<31) && !sign){
            return Integer.MIN_VALUE;
        
        }

        return sign?(int)quotient:(int)-quotient;


    }
}