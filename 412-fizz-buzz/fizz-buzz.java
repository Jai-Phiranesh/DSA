class Solution {
    public List<String> fizzBuzz(int i) {

        ArrayList<String> re = new ArrayList<>();

        for(int n=1;n<=i;n++)
        {

        if(n%3==0 && n%5==0){
            re.add("FizzBuzz");
        }
        else if(n%3==0){
            re.add("Fizz");
        }
        else if(n%5==0){
            re.add("Buzz");
        }
        else{
            re.add(n+"");
        }
        
    }

    return re;
    
    }
}