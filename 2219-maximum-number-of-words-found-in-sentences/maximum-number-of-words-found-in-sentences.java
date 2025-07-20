class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;

        for(String temp:sentences){
            String[] te = temp.split(" ");
            max=Math.max(te.length,max);
        }
        return max;
    }
}