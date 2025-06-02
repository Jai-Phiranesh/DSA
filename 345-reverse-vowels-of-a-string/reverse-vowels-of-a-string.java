class Solution {
    public String reverseVowels(String s) {
        if(s.isBlank() || s.isEmpty()){
            return s;
        }
        int left = 0;
        int right = s.length()-1;
        StringBuilder sb = new StringBuilder(s);
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('O');
        set.add('U');
        set.add('I');
        while(left<=right){

            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            
            while(!set.contains(leftChar) && left<right){
                left++;
                leftChar = s.charAt(left);
            }

            while(!set.contains(rightChar) && left<right){
                    right--;
                    rightChar = s.charAt(right);
            }

            char temp = leftChar;
            sb.setCharAt(left,rightChar);
            sb.setCharAt(right,temp);
            left++;
            right--;

        }
        return sb.toString();
    }


}