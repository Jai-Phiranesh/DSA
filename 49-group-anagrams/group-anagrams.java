class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[]s1=s.toCharArray();
         char[]t1=t.toCharArray();

         Arrays.sort(s1);
         Arrays.sort(t1);

         if(Arrays.equals(s1,t1)){
            return true;
         }
         return false;
    }
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result  = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        HashSet<String> h = new HashSet<>();


    for(int i=0;i<strs.length;i++){
        
        String cur = strs[i];
        if(h.contains(cur)){
            continue;
        }
        ArrayList<String> re = new ArrayList<>();
        re.add(cur);
        h.add(cur);
    for(int j=0;j<strs.length;j++){
        if(i==j) continue;
        if(isAnagram(cur,strs[j])){
            re.add(strs[j]);
            h.add(strs[j]);
        }
    }
    result.add(re);

    }
    return result;
    }
}