class Solution {
    public int[] plusOne(int[] digits) {
        int remainder=0;
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
       
            
        int carry = 1;
        int[] result = new int[length];

        for (int i = length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            result[i] = sum % 10;
            carry = sum / 10;
        }
        return result;
    }
}