class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int left  = 0;
        int right = cardPoints.length-1;
        int lmax = 0;
        int rmax = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<k;i++)
        {
            lmax+=cardPoints[i];
        }
        max=lmax;
       
       for(int i=k-1;i>=0;i--){
        lmax-=cardPoints[i];
        rmax+=cardPoints[right];
        right--;
        max = Math.max(max,(lmax+rmax));
       }
       return max;
    }
}