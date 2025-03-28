class Solution {

    void merge(int[] nums,int low, int mid, int high){
        int left =low;
        int right = mid+1;

        ArrayList<Integer> result = new ArrayList<Integer>();

        while(left<=mid && right<=high){
            if(nums[left]<=nums[right]){
                result.add(nums[left]);
                left++;
            }
            else{
                result.add(nums[right]);
                right++;
            }

        }

        while(left<=mid){
            result.add(nums[left]);
            left++;
        }
        while(right<=high){
            result.add(nums[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            nums[i] = result.get(i-low);
        }
    }

    int  counter(int[]  nums , int low , int mid, int high){
        int count =0;
        int right = mid+1;

        for(int i = low;i<=mid;i++){
            while(right<=high && (long)nums[i]>2L*nums[right]){
                right++;
            }
            count+=(right-(mid+1));
        }
        return count;
    }

    int mergeSort(int[] nums,int low,int high){
        int count = 0;
        if(low>=high){
            return count;
        }
        int mid = (low+high) /2;
        count+=mergeSort(nums,low,mid);
        count+=mergeSort(nums,mid+1,high);
        count +=counter(nums,low,mid,high);
        merge(nums,low,mid,high);
        return count;

    }

    public int reversePairs(int[] nums) {
        int count = mergeSort(nums,0,nums.length-1);
        return count;
    }
}