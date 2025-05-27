class Solution {
    public List<Integer> gen(int i){
        List<Integer> temp = new ArrayList<>();
        temp.add(1);

         int ans = 1;
        for(int j=1;j<i;j++){
           ans = ans*(i-j);
           ans=ans/j;
           temp.add(ans);
        }

        return temp;
    }
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            result.add(gen(i));
        }
         return result;
    }
}