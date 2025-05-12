class Solution {
    private boolean canBreak(String s,int start, Set<String> wordSet,HashMap<Integer,Boolean> map){
        if(start==s.length()){
            return true;
        }

        if(map.containsKey(start)){
            return map.get(start);
        }

        for(int i=start+1;i<=s.length();i++){
            String prefix = s.substring(start,i);
            if(wordSet.contains(prefix) && canBreak(s,i,wordSet,map)){
                map.put(start,true);
                return true;
            }
        }
        map.put(start,false);
        return false;

    }
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        HashMap<Integer,Boolean> map = new HashMap<>();
        return canBreak(s,0,wordSet,map);
    }
}