//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long N = sc.nextLong();

            Solution ob = new Solution();
            ArrayList<Long> ans = ob.factorialNumbers(N);
            for (long num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    
     ArrayList<Long>  result= new ArrayList<Long>();

     void factorialNumbershelper(long n,long i,long fact) {
        if(fact>n){
            return ;
        }
        result.add(fact);
        factorialNumbershelper(n,i+1,fact*(i+1));
        
        
    }
    
     ArrayList<Long> factorialNumbers(long n) {
       factorialNumbershelper(n,1,1);
        return result;
    }
}


