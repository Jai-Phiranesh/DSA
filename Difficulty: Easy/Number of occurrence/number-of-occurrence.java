//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            int ans = sln.countFreq(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public static int lowerBound(int[] arr,int x){
        int low  =0;
        int high = arr.length-1;
        int ans =-1;
        while(low<=high){

            int mid= (low+high)/2;
            
            if(arr[mid]==x){
                ans = mid;
                high=mid-1;
            }
            else if(arr[mid]<x){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            
        }
        return ans;
    }


    public static int upperBound(int[] arr,int x){
        int low  =0;
        int high = arr.length-1;
        int ans =-1;
        while(low<=high){

            int mid= (low+high)/2;

             if(arr[mid]==x){
                ans = mid;
                low=mid+1;
            }
            else if(arr[mid]<x){
                 low=mid+1;
                
            }
            else{
               high=mid-1;
            }

            
        }
        return ans;
    }
    int countFreq(int[] nums, int target) {
        
        
        int first=lowerBound(nums,target);
        int second=upperBound(nums,target);
        
        if(first!=-1){
            return second-first+1;
        }
        

        return 0;
    }
}
