class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();

        int element1 = Integer.MIN_VALUE;
        int element2 = Integer.MIN_VALUE;

        int count1=0;
        int count2=0;

        for(int i=0;i<nums.length;i++){

            if(count1==0 && nums[i]!=element2){
                count1=1;
                element1=nums[i];
            }
            else if(count2==0 && nums[i]!=element1){
                count2=1;
                element2=nums[i];
            }

            else if(element1==nums[i]){
                count1++;
            }
            else if(element2==nums[i]){
                count2++;
            }
            else{
                count1--;
                count2--;
            }

        }
        count1=0;
        count2=0;
        for(int i=0;i<nums.length;i++){
            if (element1==nums[i]) count1++;
            if (element2==nums[i]) count2++;

        }
        int min = (int)nums.length/3;
        min+=1;
        if(count1>=min){
            result.add(element1);
        }
        if(count2>=min){
            result.add(element2);
        }

        return result;
    }
}