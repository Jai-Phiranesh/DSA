class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        int n= intervals.length;
        int i=0;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        while(i<n && intervals[i][1]<newInterval[0]){
            ArrayList<Integer> temp= new ArrayList<>();
            temp.add(intervals[i][0]);
            temp.add(intervals[i][1]);
            ans.add(temp);
            i++;
        }

        while(i<n && intervals[i][0]<=newInterval[1]){
            newInterval[0] = Math.min(newInterval[0],intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1],intervals[i][1]);
            i++;
        }

        ArrayList<Integer> temp1= new ArrayList<>();
        temp1.add(newInterval[0]);
        temp1.add(newInterval[1]);
        ans.add(temp1);

         while(i<n){
            ArrayList<Integer> temp= new ArrayList<>();
            temp.add(intervals[i][0]);
            temp.add(intervals[i][1]);
            ans.add(temp);
            i++;
        }

        int[][] result = new int[ans.size()][2];

        for(int j=0;j<ans.size();j++){
            result[j][0] = ans.get(j).get(0);
            result[j][1] = ans.get(j).get(1);
        }

        return result;
        
    }
}