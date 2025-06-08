class Item{
    int value,weight;
    Item(int value,int weight){
        this.value=value;
        this.weight=weight;
    }
}



class Solution {
    
    public ArrayList<Item> convertToItem(int[] values, int[] weights){
        ArrayList<Item> result = new ArrayList<>();
        
        for(int i=0;i<values.length;i++){
            Item temp = new Item(values[i],weights[i]);
            result.add(temp);
        }
        return result;
    }
    
    double fractionalKnapsack(int[] values, int[] weights, int W) {
        
         ArrayList<Item> items = convertToItem(values,weights);
         
         Collections.sort(items,(Item a,Item b)->{
            double r1 = (double)(a.value) / (double)(a.weight); 
            double r2 = (double)(b.value) / (double)(b.weight); 
            if(r1 < r2) return 1; 
            else if(r1 > r2) return -1; 
            else return 0; 
         });
         
         double total =0;
         
         for(int i=0;i<items.size();i++){
             if(items.get(i).weight<=W){
                 total+=items.get(i).value;
                 W-=items.get(i).weight;
             }
             else{
                 double perWeight =((double) items.get(i).value/items.get(i).weight)*W;
                 total+=perWeight;
                 break;
             }
         }
         return total;
    }
}