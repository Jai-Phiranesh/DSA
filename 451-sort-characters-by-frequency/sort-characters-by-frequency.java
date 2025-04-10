class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }

        ArrayList<Character> ar= new ArrayList<>(map.keySet());

        Collections.sort(ar,(a, b) -> map.get(b) - map.get(a));
 String result="";
        for(int i=0;i<ar.size();i++){
            int co = map.get(ar.get(i));
            for(int j=0;j<co;j++){
                result+=ar.get(i);
            }
        }
        return result;
        
       
    }
}