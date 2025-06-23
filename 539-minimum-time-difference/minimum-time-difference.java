class Solution {
    public int findMinDifference(List<String> timePoints) {
        
        int minutes[] = new int[timePoints.size()];

        for(int i=0;i<timePoints.size();i++){
           
            String a = timePoints.get(i);
            int temp = Integer.parseInt(a.substring(0,2)) *60;
            minutes[i] = temp + Integer.parseInt(a.substring(3));
        }

        Arrays.sort(minutes);

        int min = Integer.MAX_VALUE;

        for(int i=0;i<minutes.length-1;i++){
            min  = Math.min(minutes[i+1]-minutes[i],min);
        }


         min  = Math.min(((24*60)-minutes[minutes.length-1])+minutes[0],min);
         return min;
    }
}