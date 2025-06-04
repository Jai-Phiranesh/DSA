class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int r = 0;

        int max =0;
        int[] hash = new int[26];
        int n = s.length();
        int maxFre =0;

        while(r<n){

            char current = s.charAt(r);

            hash[current-'A']++;

            maxFre = Math.max(maxFre,hash[current-'A']);

            if((r-l+1)-maxFre > k){
                hash[s.charAt(l)-'A']--;
                maxFre=0;
                l++;
            }

            if((r-l+1)-maxFre <= k){
                max = Math.max((r-l+1) ,max);
            }
            r++;
        }

        return max;

    }
}