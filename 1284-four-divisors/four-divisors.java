class Solution {
    public int sumFourDivisors(int[] nums) {
        int su = 0;
        
        for(int temp:nums){
            ArrayList<Integer> ar = new ArrayList<>();
            for(int i=1;i<=temp;i++){
               
                if(temp%i==0){
                    ar.add(i);
                }
                if (ar.size() > 4) break;
            }
            if(ar.size()==4){
                for(int temp1:ar){
                    su+=temp1;
                }
            }
        }
        return su;
    }
}