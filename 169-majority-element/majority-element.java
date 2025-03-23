class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int count = map.get(nums[i])+1;
                map.put(nums[i],count);
            }
            else{
                map.put(nums[i],1);
            }
        }
        
        for(Integer temp : map.keySet()){
            if(map.get(temp)>(nums.length/2)){
                return temp;
            }
        }

        
        return -1;
    }
}