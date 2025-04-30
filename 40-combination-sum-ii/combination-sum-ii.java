class Solution {
    private void combination(int index,List<Integer> ds,List<List<Integer>> result,int target,int [] ele){
        
            if(target == 0){
                result.add(new ArrayList<>(ds));
                return;
            }
           
        
        for(int i=index;i<ele.length;i++){
            if(i>index && ele[i]==ele[i-1]){
                continue;
            }
            if(ele[i]>target){
                break;
            }

             ds.add(ele[i]);
            combination(i+1,ds,result,target-ele[i],ele);
            ds.remove(ds.size()-1);


        }
        

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        combination(0,new ArrayList<>(),result,target,candidates);
        return result;

    }
}