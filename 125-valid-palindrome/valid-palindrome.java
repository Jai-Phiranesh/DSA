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
         int j=0;
         String newString = new String();
        //  s = s.replaceAll("\\s", "");
        //  s = s.replaceAll("[^A-Za-z0-9]", "");

        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='A'&&s.charAt(i)<='Z') || (s.charAt(i)>='a'&&s.charAt(i)<='z')|| 
            (s.charAt(i)>='0'&&s.charAt(i)<='9')  ){
                newString=newString+Character.toLowerCase(s.charAt(i));
            }
        }
         int n=newString.length();
        return isPlaindromehelper(newString,j,n);

       
    }
}