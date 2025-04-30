class Solution {
    private void subset(int ind,int[] nums,List<List<Integer>> result,ArrayList<Integer> ds){

        result.add(new ArrayList<>(ds));
        for(int i=ind;i<nums.length;i++){
            if(i!=ind && nums[i]==nums[i-1]){
                continue;
            }
            ds.add(nums[i]);
            subset(i+1,nums,result,ds);
            ds.remove(ds.size()-1);

        }

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        subset(0,nums,result,new ArrayList<>());
        return result;
    }
}