class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        
        int[] ans = new int[2];

        int sum1 = 0 ;
        int sum2 = 0 ;
        
        for(int i = 0; i<aliceSizes.length;i++){
                sum1+=aliceSizes[i];
        }

         for(int i = 0; i<bobSizes.length;i++){
                sum2+=bobSizes[i];
        }

        int temp1 = sum1;
        int temp2 = sum2;
 
    if(sum1>sum2){
        for(int i = 0; i<aliceSizes.length;i++){
            for(int j = 0; j<bobSizes.length;j++){
                   sum1+= bobSizes[j]-(aliceSizes[i]);
                   sum2+=aliceSizes[i]-(bobSizes[j]);
                   if(sum1==sum2){
                        ans[0] = aliceSizes[i];
                        ans[1] = bobSizes[j];
                        return ans;
                   }
                   else{
                        sum1=temp1;
                        sum2=temp2;
                   }
            }
        }
    }
 
     else {
        for(int i = 0; i<aliceSizes.length;i++){
            for(int j = 0; j<bobSizes.length;j++){
                   sum1+= bobSizes[j]-(aliceSizes[i]);
                   sum2+=aliceSizes[i]-(bobSizes[j]);
                   if(sum1==sum2){
                        ans[0] = aliceSizes[i];
                        ans[1] = bobSizes[j];
                        return ans;
                   }
                    else{
                        sum1=temp1;
                        sum2=temp2;
                   }
            }
        }
    }
    return ans;
    }
}