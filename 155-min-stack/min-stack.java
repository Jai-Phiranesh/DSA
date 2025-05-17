class MinStack {
    Stack<Long> st = new Stack<>();
    long minimum; 
    public MinStack() {
         minimum = Long.MAX_VALUE;
    }
    
    public void push(int va) {
        Long val = Long.valueOf(va);
        if(st.isEmpty()){
            minimum=val;
            st.push(val);
        }
        else{
            if(val>minimum){
                st.push(val);
            }
            else{
                st.push((2*val)-minimum);
                minimum=val;
            }
        }
    }
    
    public void pop() {
        if (st.isEmpty()) return;
        long x = st.pop();

        if(x<minimum){
            minimum = 2*minimum-x;
        }
    }
    
    public long top() {
        long x = st.peek();

        if(x>minimum){
           return x;
        }
        return minimum;
    }
    
    public long getMin() {
        return minimum;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */