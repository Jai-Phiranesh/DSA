class Solution {
    boolean prime(int n){
        if(n<=1){
            return false;
        }

        for(int i=2;i<=n;i++){
            if(n%i == 0 && i!=n){
                return false;
            }
        }
        return true;
        
    }
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer,Integer> map =  new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }


        for(int a:map.values()){
            if(prime(a)){
                return true;
            }
        }
        return false;
    }
}