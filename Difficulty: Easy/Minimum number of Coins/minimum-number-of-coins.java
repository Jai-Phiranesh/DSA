// User function Template for Java

class Solution {
    static List<Integer> minPartition(int amount) {
        
       int[] coins = {1, 2, 5, 10, 20, 50, 100, 200,500,2000};
       
       ArrayList<Integer> result = new ArrayList<>();
       
        for(int i=coins.length-1 ;i>=0;i--){

            while(amount>=coins[i]){
                result.add(coins[i]);
                amount-=coins[i];
            }
        }
       
        return result;
        
    }
}

