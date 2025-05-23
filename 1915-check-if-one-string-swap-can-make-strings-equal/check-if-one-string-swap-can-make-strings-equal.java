class Solution {
    public boolean areAlmostEqual(String s1, String s2) {

        if(s1.equals(s2)) return true;

        int dif = 0 ;

        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                dif++;
            }
        }

        if(dif==2){
           int index1 = -1;
           int index2 = -1;

            for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
               if(index1==-1){
                    index1=i;
               }
               else{
                index2=i;
               }    
            }
        }

        StringBuilder sb = new StringBuilder(s2);
        sb.setCharAt(index1,s2.charAt(index2));
         sb.setCharAt(index2,s2.charAt(index1));

         if(sb.toString().equals(s1)){
            return true;
         }
        }

        return false;

    }
}