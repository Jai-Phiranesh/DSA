class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        
        
        String s2=strs[strs.length-1];
        String s1=strs[0];
        int in=0;
        while(in<s1.length()&&in<s2.length()){
            if(s1.charAt(in)==s2.charAt(in)){
                in++;
            }
            else{
                break;
            }
        }
        return s1.substring(0,in);

        
    }
}