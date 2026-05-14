class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int t:nums){
            if(set.contains(t)){
                return t;
            }
            else{
                set.add(t);
            }
        }
        return -1;
    }
}