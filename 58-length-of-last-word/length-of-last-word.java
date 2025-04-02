class Solution {
    public int lengthOfLastWord(String s) {
        String[] a = s.split("\\s+");
        String temp = a[a.length-1];
        return temp.length();
    }
}