//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // Number of test cases
        for (int g = 0; g < t; g++) {
            String[] str =
                (br.readLine()).trim().split(" "); // Reading input as a string array
            int arr[] = new int[str.length]; // Creating integer array from the input
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }

            // Getting the result from the Solution class
            ArrayList<Integer> result = new Solution().subsetSums(arr);
            Collections.sort(result);
            // Printing the result in space-separated format
            for (int i = 0; i < result.size(); i++) {
                if (i != 0) System.out.print(" ");
                System.out.print(result.get(i));
            }
            System.out.println();    // Print new line after each test case
            System.out.println("~"); // Print new line after each test case
        }
    }
}

// } Driver Code Ends


// User function Template for Java//User function Template for Java
class Solution {
    private void recursion(ArrayList<Integer> result,int sum,int ind,int[] arr){
        if(arr.length==ind){
            result.add(sum);
            return;
        }
        
         recursion(result,sum+arr[ind],ind+1,arr);
         
         recursion(result,sum,ind+1,arr);
        
       
    }
    public ArrayList<Integer> subsetSums(int[] arr) {
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        recursion(result,0,0,arr);
        return result;
        
        
        
        
    }
}