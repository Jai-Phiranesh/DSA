class Solution {
    public int longestContinuousSubstring(String s) {

        int max = 1;
        int temp = 1;
        for(int i = 1; i<s.length();i++){
            if(s.charAt(i-1)+1==s.charAt(i)){
                temp++;
                max=Math.max(max,temp);
            }
            else{
                temp=1;
            }
        }
        return max;
    }
}