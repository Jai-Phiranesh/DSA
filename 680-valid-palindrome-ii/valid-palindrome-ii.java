class Solution {

    public boolean checkPlain(String s,int l,int r){

        while(l<=r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;

    }

    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;

        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return checkPlain(s,i+1,j) || checkPlain(s,i,j-1);
            }
            i++;
            j--;
        }
        return true;
    }
}