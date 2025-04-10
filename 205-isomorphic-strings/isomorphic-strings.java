class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map1 = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char s1=s.charAt(i);
            char t1=t.charAt(i);
            if(map1.containsKey(s1)){
                if(map1.get(s1)!=t1) return false;
            }
           else if(map1.containsValue(t1)){
                    return false;
           }
            else{
                 map1.put(s1,t1);
            }
           
            
        }

        
        return true;
    }
}