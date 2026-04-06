class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String temp="";
        for(String temp1:words){
            temp+=temp1.charAt(0);
        }

        if(temp.equals(s)){
            return true;
        }
        return false;
    }
}