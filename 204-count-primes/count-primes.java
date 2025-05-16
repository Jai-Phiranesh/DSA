class Solution {
    private int[] prime(int n){
        int[] prime = new int[n+1];

        for(int i=2; i<=n ; i++){
            prime[i]=1;
        }

        for(int i=2; i<=n ; i++){
            if(prime[i]==1){
                for(long j=(long)i*i ; j<=n ; j+=i){
                    prime[(int)j]=0;
                }
            }
        }
        return prime;
    }
    public int countPrimes(int n) {
        int count = 0;
        int[] prime = prime(n);
        for(int i=2;i<n;i++){
            if(prime[i] == 1){
                count++;
            }
        }
        return count;
    }
}