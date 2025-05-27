class Solution {
    public String stringHash(String s, int k) {

        int n = s.length();
        int sub = n/k;
        String result = "";
        int startindex=0;
        int endindex=k;

        for(int i = 0; i<sub; i++){
           String temp = s.substring(startindex,endindex);
           System.out.println(temp);
           startindex+=k;
           endindex+=k;
           

           int sum = 0;
           for(int j=0; j<temp.length(); j++){
                sum+=(temp.charAt(j)-'a');
           }
            

            sum=sum%26;
           char res = 'a'; 
           res+=sum;

           result+=res;
        }

        return result;


    }
}