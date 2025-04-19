import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger  dec1 = new BigInteger(a,2);
        BigInteger dec2 = new BigInteger(b,2);

        BigInteger sum= dec1.add(dec2);

        return sum.toString(2);
    }
}