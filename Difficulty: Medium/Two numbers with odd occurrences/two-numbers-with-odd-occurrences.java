//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[]= new int[N];
            for(int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int[] ans = ob.twoOddNum(Arr,N);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

// User function Template for Java
class Solution {
    public int[] twoOddNum(int Arr[], int N) {
        int[] result = {-1,-1};
        int xor = 0;
        
        for(int num:Arr){
            xor=xor^num;
        }
        
        int rm = (xor&(xor-1))^xor;
        
        int b1=0;
        int b2=0;
        
        for(int num:Arr){
           if((num & rm)!=0){
               b1=b1^num;
           }
         else{
               b2=b2^num;
           }
        }
        
       
         if(b1>b2){
             result[0]=b1;
         result[1]=b2;
         }
         else{
              result[0]=b2;
         result[1]=b1;
         }
         return result;
        
    }
}