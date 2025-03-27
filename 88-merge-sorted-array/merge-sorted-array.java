class Solution {
    public void merge(int[] nums1, int n, int[] nums2, int m) {
        int left = nums1.length-1;
        int right = 0;

        while(left>=0 && right<m){
            if( nums1[left]==0 || nums1[left]>nums2[right]  ){
                int temp = nums1[left];
                nums1[left] = nums2[right];
                nums2[right] = temp;
                left--; right++;
            }
            else{
                break;
            }
        }

        Arrays.sort(nums1);
         Arrays.sort(nums2);
    }
}