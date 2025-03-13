class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();

        for(int i=left;i<=right;i++){
            boolean flag = false;
            int itration = i;
            while(itration!=0){
                int remainder = itration%10;
                try{
                    if(i%remainder!=0){
                    flag = true;
                    break;
                }
                itration=itration/10;
            }
            catch(ArithmeticException e){
                 flag = true;
                break;
               
            }
                }
                
            if(!flag){
                result.add(i);
            }
        }
        return result;
    }
}