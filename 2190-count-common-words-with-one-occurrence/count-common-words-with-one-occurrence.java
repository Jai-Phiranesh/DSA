class Solution {
    public int countWords(String[] words1, String[] words2) {
        int count=0;
        HashMap<String,Integer> h1 = new HashMap<>();
        HashMap<String,Integer> h2 = new HashMap<>();

        for(int i=0;i<words1.length;i++){
            if(h1.containsKey(words1[i])){
                h1.put(words1[i],h1.get(words1[i])+1);
            }
            else{
                h1.put(words1[i],1);
            }
          
        }

       for(int i=0;i<words2.length;i++){
            if(h2.containsKey(words2[i])){
                h2.put(words2[i],h2.get(words2[i])+1);
            }
            else{
                h2.put(words2[i],1);
            }
          
        }

        for(var s1 : h1.keySet()){
            if(h2.containsKey(s1)){
                if(h2.get(s1)==1 && h1.get(s1)==1){
                    count=count+1;
                }
            }
        }
        return count;
    }
}