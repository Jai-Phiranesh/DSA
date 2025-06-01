class Solution {
    public String reverseOnlyLetters(String s) {
        int left = 0 ;
        int right = s.length()-1;
        StringBuilder sb = new StringBuilder(s);
        
        while(left<=right){
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            if(!Character.isLetter(leftChar)){
                left++;
                continue;
            }
            else if(!Character.isLetter(rightChar)){
                right--;
                continue;
            }
            else{
                char temp = leftChar;
                sb.setCharAt(left,rightChar);
                sb.setCharAt(right,temp);
                left++;
                right--;
            }
        }
        return sb.toString();
    }
}