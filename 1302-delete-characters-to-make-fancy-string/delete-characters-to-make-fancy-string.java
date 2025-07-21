class Solution {
    public String makeFancyString(String s) {
        StringBuilder result = new StringBuilder();
        int consicutive = 0;
        for(int i=0;i<s.length();i++){
            if(!(result.length()==0) && s.charAt(i) == result.charAt(result.length()-1)){
                if((consicutive<2)){
                    result.append(s.charAt(i));
                    consicutive++;
                }
            }
            else{
                result.append(s.charAt(i));
                consicutive = 1;
            }
        }
        return result.toString();
    }
}