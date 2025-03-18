//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver program
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().quickSort(arr, 0, n - 1);
            printArray(arr);
        }
    }
}
// } Driver Code Ends


class Solution {
    public void recursionQuickSort(int arr[],int low,int high){
        
        if(low<high){
            int partitionIndex = partition(arr,low,high);
            recursionQuickSort(arr,low,partitionIndex-1);
            recursionQuickSort(arr,partitionIndex+1,high);
            
        }
        
    }
    static void quickSort(int arr[], int low, int high) {
        Solution s = new Solution();
        s.recursionQuickSort(arr,low,high);
    }   

     int partition(int arr[], int low, int high) {
        int i = low;
        int j = high;
        int pivot = low;
        while(i<j){
            while(arr[i]<=arr[pivot]&&i<high){
                i++;
            }
            while(arr[j]>arr[pivot]&&j>low){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            
        }
        int temp = arr[pivot];
        arr[pivot]= arr[j];
        arr[j] = temp;
        return j;
    }
}
