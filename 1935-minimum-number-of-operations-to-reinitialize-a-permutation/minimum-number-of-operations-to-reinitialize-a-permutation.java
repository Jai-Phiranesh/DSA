class Solution {
    public int reinitializePermutation(int n) {

        int perm [] = new int[n];
         int temp[] = new int[n];
        for(int i=0;i<n;i++){
            perm[i]=i;
            temp[i] =i;
        }

        int count = 1;
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
           
            for(int j=0;j<n;j++){
                if(j % 2 == 0){
                    arr[j] = perm[j / 2];
                   
                }
                else if(j % 2 == 1){
                    arr[j] = perm[n / 2 + (j - 1) / 2];
                   
                }
                
                
            }
            if(Arrays.equals(temp,arr)){
                   break;
                }
                 count++;
                 perm = Arrays.copyOf(arr,arr.length);
        }
        return count;
    }
}