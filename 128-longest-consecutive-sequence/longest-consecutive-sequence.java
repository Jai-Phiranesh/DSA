class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        int longest=0;

        for(int i=0;i<nums.length;i++){
            map.add(nums[i]);
        }
        int count =0;
        for(int temp:map){
            if(!(map.contains(temp-1))){
                count =1;
               int x = temp;
               while(map.contains(x+1)){
                count++;
                x++;
               }
            }
            longest = Math.max(count,longest);
        }
        return longest;
    }
    
}