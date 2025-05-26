class Solution {
    public int findClosest(int x, int y, int z) {
        int xp = Math.abs(x-z);
        int yp = Math.abs(y-z);

        if(xp<yp){
            return 1;
        }
        else if(xp==yp){
            return 0;
        }
        return 2;
    }
}