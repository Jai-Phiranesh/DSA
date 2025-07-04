class Solution {
    public String strWithout3a3b(int a, int b) {
        int n = a+b;
        String result ="";
        boolean write_a=true;
        for(int i=0;i<n;i++){

           if(a>b){
                write_a =true;
            }
            else{
                 write_a =false;
            }

            if(i>=2 && result.charAt(i-1) =='a' && result.charAt(i-2) =='a'){
                write_a = false;
            }
            else if (i>=2 && result.charAt(i-1) =='b' && result.charAt(i-2) =='b'){
                write_a = true;
            }

            

            if(write_a){
                a--;
                result+="a";
            }
            else{
                b--;
                result+="b";
            }
        }
        return result;
    }
}