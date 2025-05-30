class Solution {
    public int[] minOperations(String boxes) {

        int n = boxes.length();
        int ans[] = new int[n]; 
       
        ArrayList<Integer> ar = new ArrayList<>();

        for(int i =0 ;i<n; i++)
        {
            if((boxes.charAt(i)=='1')){
               ar.add(i);
            }
        }

        for(int i =0 ;i<n; i++)
        {
            int count = 0;
            for(int temp:ar)
            {
                count+=Math.abs(i-temp);
            }
            ans[i]=count;
        }

        return ans;
    }
}