//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().inversionCount(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int merge(int[] arr,int low,int mid,int high){
        int count = 0;
        int left = low;
        int right = mid+1;
        ArrayList<Integer> temp = new ArrayList<>();
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                count += (mid-left+1);
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            arr[i] = temp.get(i-low);
        }
        return count;
    }
    static int divide(int[] arr,int low,int high){
        
        int count = 0;
        if(low>=high){
            return 0;
        }
        int mid = (low+high)/2;
        count+=divide(arr,low,mid);
        count+=divide(arr,mid+1,high);
        count+=merge(arr,low,mid,high);
        return count;
    }
    static int inversionCount(int arr[]) {
        
        int count = Solution.divide(arr,0,arr.length-1);
        return count;
    }
}