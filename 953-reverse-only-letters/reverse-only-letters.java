class Solution {
    public String reverseOnlyLetters(String s) {
        int left = 0 ;
        int right = s.length()-1;
        StringBuilder sb = new StringBuilder(s);
        
        while(left<=right){
            if(!Character.isLetter(s.charAt(left))){
                left++;
                continue;
            }
            else if(!Character.isLetter(s.charAt(right))){
                right--;
                continue;
            }
            else{
                char temp = sb.charAt(left);
                sb.setCharAt(left,sb.charAt(right));
                sb.setCharAt(right,temp);
                left++;
                right--;
            }
        }
        return sb.toString();
    }
}