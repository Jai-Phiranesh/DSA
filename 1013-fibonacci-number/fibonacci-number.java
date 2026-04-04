class Solution {

     public int fibrec(int n, int[] dp) {
        
        if (n <= 1) return n;

       
        if (dp[n] != -1) return dp[n];

       
        dp[n] = fibrec(n - 1, dp) + fibrec(n - 2, dp);
        return dp[n];
    }

    int fib(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        if(n<=1){
            return n;
        }
        return fibrec(n,dp);
    }
}