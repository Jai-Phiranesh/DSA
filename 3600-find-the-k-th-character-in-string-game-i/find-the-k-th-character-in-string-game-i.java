class Solution {

    public char kthCharacterHelper(int k,StringBuilder sb){
        if(sb.toString().length()>=k){
            return sb.toString().charAt(k-1);
        }
        String append="";
        for(int i=0;i<sb.toString().length();i++){
            char toadd= sb.charAt(i);
            toadd++;
            append+= toadd;
            
        }
        
        sb.append(append);
        return kthCharacterHelper(k,sb);
    }
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        return kthCharacterHelper(k,sb);
    }
}