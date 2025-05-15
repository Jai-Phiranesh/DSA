class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        // int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();

        // helper(0,nums,new ArrayList<>(),result);
        // return result;
        for(int i = 0; i<(1<<nums.length);i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                if((i & (1<<j))!=0){
                    temp.add(nums[j]);
                }
            }
            result.add(temp);
        }
          return result;

    }
  

    // private void helper(int index,int[] nums,List<Integer> current,List<List<Integer>> result){
    //     result.add(new ArrayList<>(current));

    //     for(int i=index;i<nums.length;i++){
    //         current.add(nums[i]);
    //         helper(i+1,nums,current,result);
    //         current.remove(current.size()-1);
    //     }
    // }
}