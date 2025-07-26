// User function Template for Java
class Solution {
    static ArrayList<Integer> nextGreatest(int arr[]) {
      
      int max = Integer.MIN_VALUE;
      int[] result = new int[arr.length];
      ArrayList<Integer> re = new ArrayList<>();
      
      for(int i=arr.length-1;i>=0;i--){
          
          if(max==Integer.MIN_VALUE){
              result[i]=-1;
          }
          else{
              result[i] = max;
          }
          
          max = Math.max(arr[i],max);
      }
      
      for(int temp:result){
          re.add(temp);
      }
      
      return re;
        
    }
}