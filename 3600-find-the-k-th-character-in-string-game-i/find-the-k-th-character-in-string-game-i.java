class Solution {

    public char kthCharacterHelper(int k,String s){
        if(s.length()>=k){
            return s.charAt(k-1);
        }
        String append="";
        for(int i=0;i<s.length();i++){
            char toadd= s.charAt(i);
            toadd++;
            append+= toadd;
            
        }
        
        s+=append;
        return kthCharacterHelper(k,s);
    }
    public char kthCharacter(int k) {
        String s = "a";
        return kthCharacterHelper(k,s);
    }
}