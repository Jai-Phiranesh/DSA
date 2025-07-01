class Solution {
    public boolean checkIfPangram(String sentence) {
        char s = 'a';
        char c = 'A';

        for(int i=0;i<26;i++){
          
            if(!(sentence.contains(String.valueOf(s)) || sentence.contains(String.valueOf(c)))){
                System.out.println(s);
                return false;
            }
            s++;
            c++;
        }
        return true;
    }
}