class Meetings{
    int start;
    int end;
    int position;
    
    Meetings(int start,int end,int position){
        this.start = start;
        this.end  = end;
        this.position = position;
    }
}


class Solution {
    
    public ArrayList<Meetings> covert(int start[], int end[]){
        
        ArrayList<Meetings> result = new ArrayList<>();
        
        for(int i=0;i<start.length;i++){
            Meetings temp = new Meetings(start[i],end[i],i+1);
            result.add(temp);
        }
        
        return result;
        
    }
    
    public int maxMeetings(int start[], int end[]) {
        
       ArrayList<Meetings> ar  = covert( start,end);
       
       Collections.sort(ar,(Meetings a,Meetings b)->{
           return a.end - b.end;
       });
       
       int count =1;
       
       int free = ar.get(0).end;
       
       for(int i=1;i<ar.size();i++){
           if(ar.get(i).start > free){
               count++;
               free = ar.get(i).end;
           }
       }
       return count;
    }
}
