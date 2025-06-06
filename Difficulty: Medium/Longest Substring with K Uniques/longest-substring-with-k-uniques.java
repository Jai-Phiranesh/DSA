// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        int max = -1;
        int left = 0;
        int right =0;
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        
        while(right<n){
            char current = s.charAt(right);
            if(map.containsKey(current)){
                map.put(current,map.get(current)+1);
            }
            else{
                map.put(current,1);
            }
            
            if(map.size()>k){
                char currentl = s.charAt(left);
                map.put(currentl,map.get(currentl)-1);
               
                if(map.get(currentl)==0){
                    map.remove(currentl);
                }
                 left++;
            }
            
            if(map.size()==k){
                max = Math.max(max,(right-left)+1);
            }
            right++;
        }
        return max;
        
    }
}