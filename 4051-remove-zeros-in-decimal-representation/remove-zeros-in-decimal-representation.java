class Solution {
    public long removeZeros(long n) {
        String input = n+"";

        long result = 0;

        for(int i=0;i<input.length();i++){
            if(input.charAt(i) != '0'){
                result = result*10 + (input.charAt(i)-'0');
            }
        }
        return result;
    }
}