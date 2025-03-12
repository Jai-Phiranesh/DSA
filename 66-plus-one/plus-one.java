class Solution {
    public int[] plusOne(int[] digits) {
        int length=digits.length;
        boolean flag = true;
        for(int i=0;i<digits.length;i++){

           if(digits[i]!=9){
            flag = false;
            break;
        }
        }
         
        if(flag){
             int[] result = new int[length+1];
             result[0]=1;
             return result;
        }
       
            
        int remainder = 1;
        int[] result = new int[length];

        for (int i = length - 1; i >= 0; i--) {
            int sum = digits[i] + remainder;
            result[i] = sum % 10;
            remainder = sum / 10;
        }
        return result;
    }
}