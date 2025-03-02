class Solution {
    public int reverse(int x) {
        int finalresult=0;
      
        while(!(x==0)){

            if(finalresult<Integer.MIN_VALUE/10||finalresult>Integer.MAX_VALUE/10){

               return 0;
        }
            int remainder=x%10;

             

            finalresult=(finalresult*10)+remainder;
            x=x/10;
        }
       return finalresult;
      }
        
       
         
    }
