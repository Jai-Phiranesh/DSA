class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    Stack<Integer> st = new Stack<>();
    int n2 = nums2.length;
    int[] nge = new int[n2];

    for(int i=n2-1;i>=0;i--){
        while(!st.isEmpty() && st.peek()<=nums2[i]){
            st.pop();
        }
        if(st.isEmpty()){
            nge[i]=-1;
        }
        else{
            nge[i]=st.peek();
        }
        st.push(nums2[i]);
    }
    int[] ans = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int temp = nums1[i];
                for(int j=0;j<nums2.length;j++){
                    if(temp==nums2[j]){
                        ans[i]=nge[j];
                    }
                }          
        }
        return ans;
    }
}