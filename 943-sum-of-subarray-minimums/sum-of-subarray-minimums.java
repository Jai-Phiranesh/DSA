class Solution {
    private int[] pse(int[] arr){
        int n=arr.length;
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                result[i] = -1;
            }
            else{
                 result[i] = st.peek();
            }
            st.push(i);
        }
        return result;
    }

    private int[] nse(int[] arr){
        int n=arr.length;
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                result[i] = n;
            }
            else{
                 result[i] = st.peek();
            }
            st.push(i);
        }
        return result;
    }

    public int sumSubarrayMins(int[] arr) {
        int[] nse = nse(arr);
        int[] pse = pse(arr);
        int MOD = 1_000_000_007;
        int total = 0;

        int sum=0;
        for(int i=0;i<arr.length;i++){
            long left = i-pse[i];
            long right = nse[i]-i;

             long contribution = (left *right) % MOD;
            contribution = (contribution* arr[i]) % MOD;
            total =(int)(total + contribution) % MOD;
        }

        return (int)total;
    }
}