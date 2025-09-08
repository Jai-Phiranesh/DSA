class Solution {
    public int[] getNoZeroIntegers(int n) {
        int i = 1;
        int j =n-1;

        while(i<=j){
            String sb = i+"";
            System.out.println(sb);
            if(sb.contains("0")){
                i++;
                j--;
                continue;
            }
            sb=j+"";
            System.out.println(sb);
             if(sb.contains("0")){
                i++;
                j--;
            }

            else{
                 return new int[] {i,j};
            }
               
            
        }
        return new int[] {i,j};
    }
}