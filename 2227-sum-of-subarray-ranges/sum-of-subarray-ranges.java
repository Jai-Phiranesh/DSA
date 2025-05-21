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

    public long sumMin(int[] arr) {
        int[] nse = nse(arr);
        int[] pse = pse(arr);
        long total = 0;

        
        for(int i=0;i<arr.length;i++){
            long left = i-pse[i];
            long right = nse[i]-i;

             long contribution = (left *right) ;
            contribution = (contribution* arr[i]);
            total =(total + contribution);
        }

        return total;
    }


     private int[] pge(int[] arr){
        int n=arr.length;
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
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

    private int[] nge(int[] arr){
        int n=arr.length;
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
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

    public long sumMax(int[] arr) {
        int[] nge = nge(arr);
        int[] pge = pge(arr);
        long total = 0;

       
        for(int i=0;i<arr.length;i++){
            long left = i-pge[i];
            long right = nge[i]-i;

             long contribution = (left *right) ;
            contribution = (contribution* arr[i]) ;
            total =(total + contribution) ;
        }

        return total;
    }

    public long subArrayRanges(int[] arr) {
        return sumMax(arr)-sumMin(arr);
    }
}