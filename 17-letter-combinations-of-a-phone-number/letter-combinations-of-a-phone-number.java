class Solution {
     HashMap<Character,String> map = new HashMap<>();
    private void backTrack(int index,String digits,StringBuilder path,List<String> result){
        if(digits.length()==index){
            result.add(path.toString());
            return ;
        }
        String possibledigits = map.get(digits.charAt(index));
        for(char temp : possibledigits.toCharArray()){
            path.append(temp);
            backTrack(index+1,digits,path,result);
            path.deleteCharAt(path.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
       

        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        List<String> result = new ArrayList<>();

        if(digits==null || digits.length()==0){
            return result;
        }

         backTrack(0,digits,new StringBuilder(),result);
         return result;
    }
}