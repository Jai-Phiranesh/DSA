class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n<=1){
            return s;
        }
        int maxLen=1;
        String maxString = s.substring(0,1);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(j-i+1>maxLen && isPalindrome(s.substring(i,j+1))){
                    maxLen=j-i+1;
                    maxString=s.substring(i,j+1);
                }
            }
        }
        return maxString;
    }

    public boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;

        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}