class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals,(int[] a , int [] b)->a[1]-b[1]);

        int count = 0;
        int lastEnd = intervals[0][1];

        for(int[] t : intervals){
            System.out.println(t[0] +" "+t[1]);
        }

        for(int i=1; i<intervals.length; i++){
            if(lastEnd>intervals[i][0]){
                count++;
            }
            else{
               lastEnd =  intervals[i][1];
            }
        }
        return count;
    }
}