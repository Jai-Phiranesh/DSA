class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] splitted = text.split(" ");
        int count = 0;

        out:for(String temp:splitted){

            for(int i=0;i<brokenLetters.length();i++){
                if(temp.contains(brokenLetters.charAt(i)+"")){
                    continue out;
                }
                
            }
            count++;
        }
        return count;
    }
}