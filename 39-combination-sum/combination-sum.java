class Solution {
    private void combination(int index,List<Integer> ds,List<List<Integer>> result,int target,int [] ele){
        if(index==ele.length){
            if(target == 0){
                result.add(new ArrayList<>(ds));
            }
            return;
        }

        if(ele[index]<=target){
            ds.add(ele[index]);
            combination(index,ds,result,target-ele[index],ele);
            ds.remove(ds.size()-1);

        }
        combination(index+1,ds,result,target,ele);


    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        combination(0,new ArrayList<>(),result,target,candidates);
        return result;

    }
}