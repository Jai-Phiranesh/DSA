class Solution {
    public int beautifulSubstrings(String s, int k) {
        int n = s.length();
        int sub = 0;
        for(int i = 0;i<n;i++){
            int vowels = 0;
            int cons = 0;
            for(int j =i;j<s.length();j++){
                char temp = s.charAt(j);
                if(temp=='a'||temp=='e'||temp=='i'||temp=='o'||temp=='u'){
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