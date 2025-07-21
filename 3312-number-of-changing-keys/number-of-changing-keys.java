class Solution {
    public int countKeyChanges(String s) {
        
        int count =0 ;

        for(int i=0;i<s.length()-1;i++){
            if(!(s.substring(i,i+1).equalsIgnoreCase(s.substring(i+1,i+2)))){
                
                count++;
            }
        }
        return count;
    }
}