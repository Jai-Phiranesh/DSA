//{ Driver Code Starts
// Initial Template for Java
import java.util.*;


// } Driver Code Ends


import java.util.*;

class Solution {
    public int[] leftSmaller(int arr[]) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] nse = new int[n];

        for (int i = 0; i < n; i++) {
            // Remove all elements not smaller
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }

            // Assign result
            nse[i] = st.isEmpty() ? -1 : st.peek();

            // Push current element to stack
            st.push(arr[i]);
        }

        return nse;
    }
}



//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {
            String input = sc.nextLine();
            String[] tokens = input.trim().split("\\s+");

            int[] arr = new int[tokens.length];
            for (int i = 0; i < tokens.length; i++) {
                arr[i] = Integer.parseInt(tokens[i]);
            }

            Solution ob = new Solution();
            int[] ans = ob.leftSmaller(arr);

            for (int num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.println("~");
        }

        sc.close();
    }
}

// } Driver Code Ends