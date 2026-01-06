class Solution {

    public boolean palindrome(String s,int start,int end){
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;

            }
            start++;
            end--;
        }
        return true;
    }

    public void plain(List<List<String>> result,ArrayList<String> path,int index,String s){

        if(s.length()==index){
            result.add(new ArrayList<>(path));
            return;
        }

        for(int i=index;i<s.length();i++){
            if(palindrome(s,index,i)){
                path.add(s.substring(index,i+1));
                plain(result,path,i+1,s);
                path.remove(path.size()-1);
            }
        }

    }
    public List<List<String>> partition(String s) {
        List<List<String>> Result = new ArrayList<>();
         plain(Result,new ArrayList<String>(),0,s);
         return Result;

    }
}