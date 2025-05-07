class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sr=new StringBuilder();
        int carry=0;
        int sum=0;
        int n=num1.length()-1;
        int m=num2.length()-1;

        while(n>=0 || m>=0 || carry>0){
            int dig1=(n>=0)?num1.charAt(n)-'0':0;
           int dig2=(m>=0)?num2.charAt(m)-'0':0;

            sum=dig1+dig2+carry;
            sr.append(sum%10);
            carry=sum/10;
            n--;
            m--;
        }

        return sr.reverse().toString();



    }
}