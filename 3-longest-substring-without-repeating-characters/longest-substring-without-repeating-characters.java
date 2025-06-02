class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character,Integer> set = new HashMap<>();

        int left = 0;
        int right = 0;
        int count=0;

        while(right<s.length()){
            char current =s.charAt(right);
            if(set.containsKey(current)){
                left = Math.max(left,set.get(current)+1); 
            }
            set.put(current,right);
            int len = right-left+1;
             count=Math.max(len,count);
            right++;
            
        }
        return count;
    }
}