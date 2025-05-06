class Solution {
    public int countSegments(String s) {
        String[] sp = s.split(" ");
        int co=0;
        for(String i:sp){
            
            if(!(i.equals(""))){
                co++;
            }
                
            
        }
        return co;
    }
}