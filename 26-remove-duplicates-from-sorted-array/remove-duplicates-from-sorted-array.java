class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> st = new HashSet<>();
        int index = 0;
        for(int t:nums){
           if(!st.contains(t)){
            nums[index]=t;
            index++;
            st.add(t);
           }
        }

        return st.size();
    }
}