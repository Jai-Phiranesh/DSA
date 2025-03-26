class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum=0;
        int count =0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int remove = sum-k;
            if(map.containsKey(remove)){
                 count+=map.get(remove);
            }
           
            if(!(map.containsKey(sum))){
                map.put(sum,1);
            }
            else{
                int temp = map.get(sum)+1;
                map.put(sum,temp);
            }
        }

        return count;
    }
}