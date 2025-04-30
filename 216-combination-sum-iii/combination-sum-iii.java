class Solution {
    private void combination(int start,List<Integer> ds,List<List<Integer>> result,int target,int k){
        if(ds.size()==k){
            if(target == 0){
                result.add(new ArrayList<>(ds));
            }
            return;
        }


        for(int i=start;i<=9;i++){
            if(i>target) break;
            ds.add(i);
            combination(i+1,ds,result,target-i,k);
            ds.remove(ds.size()-1);

        }
       


    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        combination(1,new ArrayList<>(),result,n,k);
        return result;

    }
}