class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('|| 
            s.charAt(i)=='{'||
            s.charAt(i)=='['){
                st.push(s.charAt(i));
            }

            else{
                char temp = s.charAt(i);
                if(st.isEmpty()){
                    return false;
                }

                if(!((temp=='}'&& st.peek()=='{')||
                (temp==']'&& st.peek()=='[')||
                (temp==')'&& st.peek()=='('))){
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();
    }
}