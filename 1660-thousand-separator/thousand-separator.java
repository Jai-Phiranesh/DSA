class Solution {
    public String thousandSeparator(int n) {

       StringBuilder s = new StringBuilder();
        int count =0;
        if(n==0){
            return "0";
        }
        while(n!=0){
            s.append(n%10);
            n=n/10;
            count++;
            if(n==0){   
                continue;
            }
            if(count==3){
                 count=0;
                s.append(".");
            }
        }

        return s.reverse().toString();
        

    }
}