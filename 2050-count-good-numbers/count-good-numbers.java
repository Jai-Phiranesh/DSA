class Solution {
    static final long MOD = 1_000_000_007;
    private long modPow(long base,long exponent,long mod){
        if(exponent==0){
            return 1;
        }

        long half = modPow(base,exponent/2,mod);
        long result = (half*half)%mod;

        if(exponent%2==1){
            result = (result*base)%mod;
        }
        return result;

    }
    public int countGoodNumbers(long n) {
        
        long odd = n/2;
        long eve = (n+1)/2;

        long evenChoices = modPow(5, eve, MOD);
        long oddChoices = modPow(4, odd, MOD);

        return (int)((evenChoices*oddChoices)%MOD);


    }
}