class Solution {
    public int totalFruit(int[] fruits) {

        int l = 0;
        int r = 0;
        int n = fruits.length;
        int max =0;
        HashMap<Integer,Integer> map = new HashMap<>();

        while(r<n){

            if(map.containsKey(fruits[r])){
                map.put(fruits[r],map.get(fruits[r])+1);
            }
            else{
                map.put(fruits[r],1);
            }

            if(map.size()>2){
               map.put(fruits[l],map.get(fruits[l])-1);
               if(map.get(fruits[l])==0){
                    map.remove(fruits[l]);
               }
               l++;
            }

            
                max = Math.max((r-l)+1 , max);
                r++;
            
        }

        return max;
        
    }
}