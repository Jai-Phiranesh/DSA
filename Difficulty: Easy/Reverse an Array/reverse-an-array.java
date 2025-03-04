//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        while (tc-- > 0) {
            String str[] = br.readLine().split(" ");
            int arr[] = new int[str.length];

            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            Solution obj = new Solution();

            obj.reverseArray(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    
    public void reverseArrayhelper(int arr[],int start,int end) {
        if(start>=end){
            return;
        }
        int temp;
        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        
        reverseArrayhelper(arr,start+1,end-1);
    }
    
   public void reverseArray(int arr[]) {
        int n=arr.length;
        reverseArrayhelper(arr,0,n-1);
        
    }
}