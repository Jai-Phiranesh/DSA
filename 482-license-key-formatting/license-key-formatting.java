class Solution {
    public String licenseKeyFormatting(String s, int k) {
        String[] splited = s.split("\\-");
        StringBuilder sb = new StringBuilder();

        for(String temp:splited){
            
            for(int i=0;i<temp.length();i++){
                sb.append(Character.toUpperCase(temp.charAt(i)));
            }

        }


        StringBuilder result = new StringBuilder();
        int tk = 0;
        for(int i=sb.length()-1;i>=0;i--){

            result.append(sb.charAt(i));
            tk++;

            if(i!=0 && tk==k){
                result.append('-');
                tk=0;
            }
        }

        return result.reverse().toString();
    }
}