class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int maxtime = Integer.MIN_VALUE;
        char max = '1';

        for(int i=0;i<keysPressed.length();i++){
            int time = 0;

            if(i==0){
                time = releaseTimes[0]-0;
                maxtime=Math.max(maxtime,time);
                max=keysPressed.charAt(i);

            }
            else{
                time = releaseTimes[i]-releaseTimes[i-1];
                if(maxtime==time){
                    if(max<keysPressed.charAt(i)){
                        max=keysPressed.charAt(i);
                        continue;
                    }
                }

                else if(maxtime<time){
                    max=keysPressed.charAt(i);
                     maxtime=Math.max(maxtime,time);
                }

               
                
            }
           
        }
        return max;
    }
}