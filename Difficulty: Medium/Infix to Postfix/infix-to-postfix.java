//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            System.out.println(new Solution().infixToPostfix(br.readLine().trim()));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    
    private static int prec(char a){
        switch(a){
            case '^':
                return 3;
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
        }
        return -1;
    } 
    public static String infixToPostfix(String s) {
        String result = "";
        
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char temp  = s.charAt(i);
            
            if(Character.isLetterOrDigit(temp)){
                result+=temp;
            }
            
            else if(temp == '(') st.push('(');
            
            else if(temp==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    result+=st.pop();
                }
                st.pop();
            }
           
            
            else{
                while(! st.isEmpty() && prec(temp) <= prec(st.peek())){
                    result+=st.pop();
                }
                st.push(temp);
            }
        }
        while(!st.isEmpty()){
            result+=st.pop();
        }
        return result;
        
    }
}