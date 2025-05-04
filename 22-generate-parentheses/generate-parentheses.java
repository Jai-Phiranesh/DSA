class Solution {
    public void parentheses(List<String> result,int n,int open,int close,String s){
        if(n*2==s.length()){
            result.add(s);;
            return;
        }

        if(open<n){
            parentheses(result,n,open+1,close,s+"(");
        }

        if(close<open){
            parentheses(result,n,open,close+1,s+")");
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        parentheses(result,n,0,0,"");
        return result;


    }
}