class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();

        for(int i=0;i<num.length();i++){
            while(!(st.isEmpty()) && k >0 && (st.peek()-'0')>(num.charAt(i)-'0')){
                st.pop();
                k=k-1;
            }
            st.push(num.charAt(i));
        }

        while(k>0){
            st.pop();
            k--;
        }
        if(st.isEmpty()){
            return "0";
        }
        StringBuilder s = new StringBuilder();
        while(!st.isEmpty()){
            s.append(st.pop());
        }

        while(s.length()>0 && s.charAt(s.length()-1)=='0'){
            s.deleteCharAt(s.length()-1);
        }
        if(s.length()==0){
             return "0";
        }
        s.reverse();
        return s.toString();
    }
}