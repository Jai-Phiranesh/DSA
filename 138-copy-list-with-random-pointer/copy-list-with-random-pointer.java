/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/



class Solution {

    void dup(Node head){
        Node temp=head;

        while(temp!=null){
            Node copy = new Node(temp.val);
            copy.next=temp.next;
            temp.next=copy;
            temp=temp.next.next;
        }
    }

    void connectRandom(Node head){
        Node temp = head;
        while(temp!=null){
            Node copy = temp.next;
            if(temp.random!=null){
                copy.random=temp.random.next;
            }
            
            temp = temp.next.next;
        }
    }

    Node getClone(Node head){
        Node temp = head;
        Node dummy = new Node(-1);
        Node res=dummy;

        while(temp!=null){
            res.next=temp.next;
            temp.next=temp.next.next; 
            temp=temp.next;
            res=res.next;
        }

        return dummy.next;
    }

    public Node copyRandomList(Node head) {
        if(head==null){
            return head;
        }
        
        dup(head);
        connectRandom(head);
        return getClone(head);
 
    }
}