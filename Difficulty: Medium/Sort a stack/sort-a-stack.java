//{ Driver Code Starts
import java.util.*;
import java.util.Scanner;
import java.util.Stack;

class SortedStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Stack<Integer> s = new Stack<>();
            int n = sc.nextInt();
            while (n-- > 0) s.push(sc.nextInt());
            GfG g = new GfG();
            Stack<Integer> a = g.sort(s);
            while (!a.empty()) {
                System.out.print(a.peek() + " ");
                a.pop();
            }
            System.out.println();
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


/*Complete the function below*/
class GfG {
    public void insertSort(Stack<Integer> st,int ele){
        if(st.isEmpty()||st.peek()<ele){
            st.push(ele);
            return;
        }
        
        int temp=st.pop();
        insertSort(st,ele);
        st.push(temp);
    }
    
    public void sortrec(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        
        int ele = st.pop();
        sortrec(st);
        insertSort(st,ele);
    }
    public Stack<Integer> sort(Stack<Integer> st) {
        sortrec(st);
        return st;
    }
}