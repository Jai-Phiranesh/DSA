class Solution {
    public int firstUniqChar(String s) {
       int[] hashing = new int[26];

        for(int i=0;i<s.length();i++){
           hashing[s.charAt(i)-'a']++;
        }

        for(int i=0;i<s.length();i++){
            if(hashing[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
}