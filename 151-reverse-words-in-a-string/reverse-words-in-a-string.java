class Solution {
    
    public String reverseWords(String s) {
       s=s.trim();
        int i=0;
        int j=s.length()-1;
        String result="";
        String temp="";
        while(i<=j){
            int ch=s.charAt(i);
            if(!(ch==' ')){
                temp+=s.charAt(i);
            }
            else if(ch==' '){
                if(!temp.equals("")){
                    if(!result.equals("")){
                        result=temp+" "+result;
                        temp="";
                    }
                    else{
                        result=temp;
                        temp="";
                    }
                }
            }
            if(i==j){
                if(!result.equals("")){
                        result=temp+" "+result;
                        
                    }
                    else{
                        result=temp;
                       
                    }
            }
            i++;
        }
        return result;

    }
}