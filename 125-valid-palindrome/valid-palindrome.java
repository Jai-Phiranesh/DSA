class Solution {
    boolean isPlaindromehelper(String s,int i,int n){
         if(i>=n/2){
            return true;
        }
        if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(n-1-i))){
            return false;
        }
        

        return isPlaindromehelper(s,i+1,n);
    }
   
    public boolean isPalindrome(String s)
     {
         int i=0;
         s = s.replaceAll("\\s", "");
         s = s.replaceAll("[^A-Za-z0-9]", "");
         int n=s.length();
        return isPlaindromehelper(s,i,n);

       
    }
}