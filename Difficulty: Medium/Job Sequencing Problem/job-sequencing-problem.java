class Job{
    int dl;
    int pro;
    
    public Job(int dl , int pro){
        this.dl =dl;
        this.pro = pro;
    }
}


class Solution {
    int [] maxar ;
    public ArrayList<Job> convert(int[] deadline, int[] profit){
        ArrayList<Job> result = new ArrayList<>();
        
        for(int i=0;i<deadline.length;i++){
            Job tem = new Job(deadline[i],profit[i]);
            result.add(tem);
        }
        return result;
    }

    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        
        ArrayList<Job> jobs = convert(deadline,profit);
        
        Collections.sort(jobs , (Job a , Job b) -> b.pro-a.pro);
        
        int count  = 0;
        int profitre = 0;
        int max  = -1;
        
        for(int i=0;i<deadline.length;i++){
            max = Math.max(max,deadline[i]);
        }
        
        maxar = new int[max];
        
        for(int i=0;i<jobs.size(); i++){
            int dl = jobs.get(i).dl;
            
            for(int j = dl-1; j>=0; j--){
                if(maxar[j]==0){
                    count++;
                    profitre+=jobs.get(i).pro;
                    maxar[j] = i+1;
                    break;
                }
            }
        }
        
         ArrayList<Integer> result =new ArrayList<Integer> ();
         result.add(count);
         result.add(profitre);
        return result;
    }
}