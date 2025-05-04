class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> result = new ArrayList<>();
         HashMap<Integer,Integer> h1 = new HashMap<>();

         for(int num:nums1){
           h1.put(num,h1.getOrDefault(num,0)+1);
         } 

        for(int num:nums2){
            if(h1.containsKey(num) && h1.get(num)>0){
                 result.add(num);
                 h1.put(num,h1.get(num)-1);
            }
           
         } 

         int[] resultf = new int[result.size()];
         int i=0;

         for(int num:result){
            resultf[i]=num;
            i++;
         }
         return resultf;
    }
}