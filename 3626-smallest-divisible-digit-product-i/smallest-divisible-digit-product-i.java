class Solution {
    public int smallestNumber(int n, int t) {
        
        while(true){
            int temp = n++;
            int result =1;
            while(temp!=0){
                result*=temp%10;
                temp/=10;
            }
            if(result%t==0){
                return --n;
            }
            
        }
       
    }
}