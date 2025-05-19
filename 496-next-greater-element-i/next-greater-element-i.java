class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];


        a:for(int i=0;i<nums1.length;i++){
            int temp  = nums1[i];
            for(int j=0;j<nums2.length;j++){
                if(nums2[j]!=temp){
                    continue;
                }
                else{
                    for(int k=j;k<nums2.length;k++){
                    if(nums2[k]>temp){
                    result[i]=nums2[k];
                    continue a;
                    
                }
                }
                 result[i]=-1;
                }
            
                
            }
           
        }
        return result;
    }
}