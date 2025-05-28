class Solution {
    public char max(HashMap<Character,Integer> map){
        char maxchar = 'a';
        int max = Integer.MIN_VALUE;
        for(var charac:map.keySet()){
            if(max<map.get(charac)){
                maxchar = charac;
                max=map.get(charac);
            }
        }
        return maxchar;
    }
    public int minimumPushes(String word) {

        char[] temp = word.toCharArray();
        Arrays.sort(temp);
        HashMap<Character,Integer> map = new HashMap<>();

        for(char temp1 : temp){
                if(map.containsKey(temp1)){
                    map.put(temp1,map.get(temp1)+1);
                }
                else{
                    map.put(temp1,1);
                }
        }

        HashMap<Integer,ArrayList<Character>> mapresult = new HashMap<>();
        int count = 1;
        int minCount  = 0;
        while(map.size()!=0){
            char max = max(map);
            System.out.println(max);
            if(mapresult.containsKey(count)){
                var ar = mapresult.get(count);
                ar.add(max);
                minCount+=map.get(max)*ar.size();
                map.remove(max);
                count++;
            }
            else{
                ArrayList<Character> ar = new ArrayList<>();
                minCount+=map.get(max);
                ar.add(max);
                mapresult.put(count,ar);
                map.remove(max);
                count++;
            
            }
            if(count>8){
                count=1;
            }
        }

        return minCount;

        


    }
}