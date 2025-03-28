class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Arrays.sort(intervals , new Comparator<int[]>(){
            public int compare(int[]a,int[]b){
                return a[0]-b[0];
            }
        });

        for(int i = 0; i<intervals.length;i++){
            if(ans.isEmpty() || intervals[i][0]>ans.get(ans.size()-1).get(1)){
                ArrayList<Integer> temp= new ArrayList<>();
                temp.add(intervals[i][0]);
                temp.add(intervals[i][1]);
                ans.add(temp);
            }
            else{
                ans.get(ans.size()-1).set(1,Math.max(ans.get(ans.size()-1).get(1),intervals[i][1]));
            }
        }

        int[][] result = new int[ans.size()][2];

        for(int i=0;i<ans.size();i++){
            result[i][0] = ans.get(i).get(0);
            result[i][1] = ans.get(i).get(1);
        }

        return result;
    }
}