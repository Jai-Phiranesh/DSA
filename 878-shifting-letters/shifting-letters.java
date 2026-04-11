class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);
        long total = 0;

        for(int i = n - 1; i >= 0; i--) {

            total = (total + shifts[i]) % 26; 
            int tt = sb.charAt(i) - 'a';
            tt = (int)((tt + total) % 26);      
            char t = (char)(tt + 'a');
            sb.setCharAt(i, t);
        }

        return sb.toString();
    }
}