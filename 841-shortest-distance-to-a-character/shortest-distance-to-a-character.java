class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] result = new int[s.length()];
        int prev =-1;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                prev = i;
            }
            if(prev!=-1){
                 result[i] = Math.abs(i-prev);
            }
            else{
                result[i]=Integer.MAX_VALUE;
            }
           
        }

         prev =-1;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==c){
                prev = i;
            }
            if(prev!=-1){
                 result[i] = Math.min(Math.abs(i-prev),result[i]);
            }
           
        }

        return result;
    }
}