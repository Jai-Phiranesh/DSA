class Solution {
    public String truncateSentence(String s, int k) {
        String[] s1 = s.split(" ");

        String ans ="";
       
        for(int i = 0;i<k;i++){
           
             if(i==k-1) ans+=s1[i];
             else{
                 ans+=s1[i]+" ";
             }
            
        }
        return ans;
    }
}