class DoubleLL{

    int key;
    int val;
    DoubleLL next=null;
    DoubleLL prev=null;

    public DoubleLL(int key,int val){
        this.key = key;
        this.val = val;
    }
}



class LRUCache {

    HashMap<Integer,DoubleLL> map = new HashMap<>();
    int capacity;
    DoubleLL head = new DoubleLL(-1,-1);
    DoubleLL tail = new DoubleLL(-1,-1);

    public LRUCache(int capacity){
        this.capacity=capacity;
        this.head.next=tail;
        this.tail.prev=head;
    }

    public int get(int key) {
         if(!map.containsKey(key)){
            return -1;
        }
        int val = map.get(key).val;
        delete(map.get(key));
        insertAfterHead(map.get(key));
        return val;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            DoubleLL node = map.get(key);
            node.val = value;
            delete(node);
            insertAfterHead(node);
        }
        else{
            if(map.size()==capacity){
                DoubleLL node = tail.prev;
                map.remove(node.key);
                delete(node);
            }
            DoubleLL node = new DoubleLL(key,value);
            map.put(key,node);
            insertAfterHead(node);
        }
    }

    public void insertAfterHead(DoubleLL node){
        node.next=head.next;
        head.next.prev=node;
        head.next=node;
        node.prev=head;
    }

     public void delete(DoubleLL node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */