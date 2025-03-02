class Solution {
    public boolean isPalindrome(int x) {
        int finalx=x;
        int reverse=0;
        while(!(x==0)){
            int remainder=x%10;
            reverse=(reverse*10)+remainder;
            x=x/10;
        }
        if(finalx==reverse && reverse>=0){
            return true;
        }
        else{
            return false;
        }

    }
}