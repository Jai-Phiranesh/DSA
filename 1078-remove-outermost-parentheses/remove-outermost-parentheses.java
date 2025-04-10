class Solution {
    public String removeOuterParentheses(String s) {
        String result="";
        int open =0;
        int close=0;
        for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='('){
                    
                    if(open>0){
                        result=result+"(";
                    }
                    open++;
                }
                else if(s.charAt(i)==')'){
                    open--;
                    if(open>0){
                        result=result+")";
                    }
                }
        }
        return result;
    }
}