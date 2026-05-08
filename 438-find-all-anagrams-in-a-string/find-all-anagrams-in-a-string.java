class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();


        int [] freq = new int[26];

        for(int i=0;i<p.length();i++){
            freq[p.charAt(i)-'a']++;
        }

        int i=0;
        int j=0;
        int n=s.length();
        int k=p.length();

        while(j<n){
            freq[s.charAt(j)-'a']--;

            if(j-i+1 ==k){
                if(allZero(freq)){
                    result.add(i);
                }
                freq[ s.charAt(i) - 'a' ] += 1;
                i++;
            }
            j++;
        }
        return result;
    }

    public boolean allZero(int[] freq){
        for(int temp:freq){
            if(temp!=0){
                return false;
            }
        }
        return true;
    }
}