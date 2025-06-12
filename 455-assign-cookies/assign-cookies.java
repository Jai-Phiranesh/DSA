class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count = 0;
        int r =0;
        int l =0;
        Arrays.sort(g);
        Arrays.sort(s);

        while(r<s.length && l<g.length){
            if(s[r]>=g[l]){
                r++;
                 l++;
                count++;
            }
            else{
                r++;
            }
        }
        return count;
    }
}