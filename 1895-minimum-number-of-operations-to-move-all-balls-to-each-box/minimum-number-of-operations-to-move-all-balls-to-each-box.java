class Solution {
    public int[] minOperations(String boxes) {

        int [] ans = new int[boxes.length()];
        int n = boxes.length();

        for(int i=0;i<n;i++)
        {
            int count = 0;
            for(int j=0;j<n;j++)
            {
                if(i==j || boxes.charAt(j)=='0') continue;
                else{
                    count += Math.abs(i-j);
                }
            }
            ans[i]=count;
        }
        return ans;
    }
}