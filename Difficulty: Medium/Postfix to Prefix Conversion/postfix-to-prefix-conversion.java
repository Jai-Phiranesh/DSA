//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            sc.nextLine();
            String s = sc.next();
            Solution obj = new Solution();
            String ans = obj.postToPre(s);
            System.out.println(ans);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static String postToPre(String s) {
        int i =0;
        Stack<String> st = new Stack<>();
        
        while(i<s.length()){
            if(Character.isLetterOrDigit(s.charAt(i))){
                 st.push(String.valueOf(s.charAt(i)));
            }
            else{
                String t1 = st.pop();
                 String t2 = st.pop();
                 String temp = s.charAt(i)+t2+t1;
                 st.push(temp);
            }
            i++;
        }
        return st.peek();
        
    }
}
