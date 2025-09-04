class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        

        for(int i=0;i<nums.length;i++){
            int te = nums[i];
            set.add(te);
            int re = 0;

            while(te!=0){
                int remain = te%10;
                re = (re*10)+remain;
                te/=10;
            }
            System.out.println(re);
            set.add(re);
        }
        return set.size();
    }
}