class Solution {
    public int beautifulSubstrings(String s, int k) {
        int sub = 0;
        for(int i = 0;i<s.length();i++){
            int vowels = 0;
            int cons = 0;
            for(int j =i;j<s.length();j++){
                if(s.charAt(j)=='a'||s.charAt(j)=='e'||s.charAt(j)=='i'||s.charAt(j)=='o'||s.charAt(j)=='u'){
                    vowels++;
                }
                else{
                    cons++;
                }
                if(vowels==cons && (vowels*cons)%k==0){
                sub++;
                }
            }  
        }
        return sub;
    }
}