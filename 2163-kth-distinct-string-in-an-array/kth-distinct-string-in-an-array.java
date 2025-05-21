class Solution {
    public String kthDistinct(String[] arr, int k) {
       
         HashMap<String,Integer> map1 = new HashMap<>();
        
       
        for(int i=0;i<arr.length;i++){
            if(map1.containsKey(arr[i])){
                 map1.put(arr[i],map1.get(arr[i])+1);
            }
            else{
               
                map1.put(arr[i],1);
            }    
        }
        int temp1=k;
        for(String temp :arr){
            if(map1.get(temp)==1){
                temp1--;
                if(temp1==0){
                    return temp;
                }
            }
        }
        return "";
    }
}