class Solution {

    public int sum(int n){
        int sum = 0;

        while(n!=0){
            int temp = n%10;
            sum += Math.pow(temp,2);
            n = n/10;
        }
        return sum;
    }

    public boolean isHappy(int n) {

        HashSet<Integer> result = new HashSet<>();
        
        
        while (n != 1 && !result.contains(n)) {
            result.add(n);
            n = sum(n);
        }
       return n==1;
    }
}