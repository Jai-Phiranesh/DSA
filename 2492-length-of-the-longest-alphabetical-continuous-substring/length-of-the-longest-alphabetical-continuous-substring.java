class Solution {
    public int longestContinuousSubstring(String s) {

        int max = 1;
        int temp = 1;
        for(int i = 0; i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)-1){
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