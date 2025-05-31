class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        HashSet<ArrayList<Integer>> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                    if(i==j) continue;
                    int k = j+1;
                    int l = nums.length-1;

                    while(k<l){
                        long sum = nums[i];
                        sum+=nums[j];
                        sum+=nums[k];
                        sum+=nums[l];

                        if(sum<target){
                            k++;
                        }

                        else if(sum>target){
                            l--;
                        }

                        else if(sum==target){
                            ArrayList<Integer> arr = new ArrayList<>();
                            arr.add(nums[i]);
                            arr.add(nums[j]);
                            arr.add(nums[k]);
                            arr.add(nums[l]);
                               Collections.sort(arr);
                               set.add(arr);
                               k++;
                               l--;

                        }


                    }
                }
            }
        List<List<Integer>> result = new ArrayList<>(set);
        return result;
    }
}