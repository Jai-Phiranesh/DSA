class Solution {
    public String digitSum(String s, int k) {

        while (s.length() > k) {

            int i = 0;
            int sum = 0;
            StringBuilder sb = new StringBuilder();

            while (i < s.length()) {

                sum += s.charAt(i++) - '0';

                if (i % k == 0 || i == s.length()) {
                    sb.append(sum);
                    sum = 0;
                }
            }

            s = sb.toString();
        }

        return s;
    }
}