class Solution {

    public int maxConsecutive(String s, int k,char target) {
        int flips = 0;
        int max=0;
        int j=0;
        int i=0;

        while(j<s.length()){

            if(target!=s.charAt(j)){
                flips++;
            }

            while(flips>k){
                if(s.charAt(i)!=target){
                    flips--;
                }
                i++;
            }
            max=Math.max(max,j-i+1);
            j++;
           
        }
        return max;
    }

    public int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(
            maxConsecutive(answerKey,k,'T'),
             maxConsecutive(answerKey,k,'F')
        );
    }
}