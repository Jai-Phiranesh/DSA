class Solution {
    boolean twoSum(int arr[], int target) {
        HashSet<Integer> set = new HashSet<>();
        
        int sum =0;
        for(int i=0;i<arr.length;i++){
            int remain = (target-arr[i]);
            if(set.contains(remain)){
                return true;
            }
            else {
                set.add(arr[i]);
            }
        }
        return false;
        
    }
}