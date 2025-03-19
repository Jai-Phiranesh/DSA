class Solution {
    public int singleNumber(int[] nums) {
        // HashMap<Integer,Integer> map = new HashMap<>();

        // for(int i=0;i<nums.length;i++){
        //     if(map.containsKey(nums[i])){
        //         map.put(nums[i],map.get(nums[i])+1);
        //     }
        //     else{
        //         map.put(nums[i],1);
        //     }
        // }

        // for(Integer a:map.keySet()){
        //     if(map.get(a)==1){
        //         return a;
        //     }
        // }
        // return -1;
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor=xor^nums[i];
        }
        return xor;
    }
}