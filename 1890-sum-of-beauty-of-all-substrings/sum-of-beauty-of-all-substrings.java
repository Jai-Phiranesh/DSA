class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int totalSum=0;

        for(int i=0;i<n;i++){
            HashMap<Character,Integer> map = new HashMap<>();
            for(int j=i;j<n;j++){
                if(map.containsKey(s.charAt(j))){
                    map.put(s.charAt(j),map.get(s.charAt(j))+1);
                }
                else{
                    map.put(s.charAt(j),0);
                }
                int min =Integer.MAX_VALUE;
             int max =Integer.MIN_VALUE;
            for(Integer temp : map.values()){
                min = Math.min(temp,min);
                max = Math.max(temp,max);
            }

            totalSum+=(max-min);
            
            }
            
        }
        return totalSum;
    }
}