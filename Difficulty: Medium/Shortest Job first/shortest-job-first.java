// User function Template for Java

class Solution {
    static int solve(int bt[]) {
        
        
        Arrays.sort(bt);
        int w = 0;
        int t= 0;
        
        for (int i=0;i<bt.length;i++){
            w+=t;
            t+=bt[i];
        }
        return (w/bt.length);
        
    }
}
