class Solution {
    public int findLucky(int[] arr) {
        int[] hash = new int[501];
        

        for(int temp:arr){
            hash[temp]++;
        }


        int lucky = Integer.MIN_VALUE;
        for(int i=1;i<=arr.length;i++){
            if(hash[i] == i){
               lucky=Math.max(lucky,i);
            }
        }
        if(lucky!=Integer.MIN_VALUE){
            return lucky;
        }
        return -1;

    }
}