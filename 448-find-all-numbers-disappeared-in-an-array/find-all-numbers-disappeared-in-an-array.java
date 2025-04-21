class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n= nums.length;
        int[] temp = new int[n+1];

        for(int tempele:nums){
            temp[tempele]++;
        }

        for(int i=1;i<nums.length+1;i++){
            if(temp[i]==0){
                result.add(i);
            }
        }

        return result;
    }
}