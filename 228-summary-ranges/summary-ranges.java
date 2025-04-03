class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> result = new ArrayList<>();
        String res = "";
        boolean bool = false;
        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1){
                
                res=res+nums[i];
                result.add(res);
                break;
                
                }
            
            if(nums[i]!=(nums[i+1]-1)){
                res=res+nums[i];
                result.add(res);
                res="";
                bool = false;
            }
            else{
                if(bool){
                    continue;
                }
                res=res+nums[i];
                res+="->";
                bool = true;
            }}
            return result;
        }
        
    }
