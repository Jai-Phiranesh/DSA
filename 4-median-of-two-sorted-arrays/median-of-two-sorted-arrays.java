class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
         if (n1 > n2) return findMedianSortedArrays(nums2, nums1);
        int n = n1+n2;
        int ind2 = n/2;
        int ind1 = ind2-1;
        int index1=-1;
        int index2=-1;
       
        int j=0;
         int i =0;
        int count = 0;
        while(i<n1 && j<n2){
            if(nums1[i]<=nums2[j]){
                if(count==ind1) index1=nums1[i];
                if(count==ind2) index2=nums1[i];
                i++;
                count++;

            }
            else{
                if(count==ind1) index1=nums2[j];
                if(count==ind2) index2=nums2[j];
                j++;
                count++;
            }
        }
        while(i<n1){
            if(count==ind1) index1=nums1[i];
            if(count==ind2) index2=nums1[i];
            i++;
            count++;
        }
        while(j<n2){
            if(count==ind1) index1=nums2[j];
            if(count==ind2) index2=nums2[j];
            
            count++;
            j++;
        }

        if(n%2==1){
            return index2;
        }
        else{
            return (double) (index1+index2)/2;
        }

    }
}