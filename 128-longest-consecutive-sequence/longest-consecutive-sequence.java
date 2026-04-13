class Solution {
    public int longestConsecutive(int[] nums) {
         int longest=0;
        HashSet<Integer> map = new HashSet<>();
       

        for(int i=0;i<nums.length;i++){
            map.add(nums[i]);
        }
        int count =0;
        for(int temp:map){
            if(!(map.contains(temp-1))){
                count =1;
              
               while(map.contains(temp+1)){
                count++;
                temp++;
               }
            }
            longest = Math.max(count,longest);
        }
        return longest;
    }
    
}