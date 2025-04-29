/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    private ListNode nthNode(ListNode head,int k){
        ListNode temp = head;
        int c =1;

        while(temp!=null){
            if(k==c){
                return temp;
            }
            c++;
            temp=temp.next;
        }
        return temp;

    }
    public ListNode rotateRight(ListNode head, int k) {
         if(head==null||head.next==null){
            return head;
        }
        ListNode temp =head;

       
       
        int len =1;
        while(temp.next!=null){
            len++;
            temp=temp.next;
        }
        

        if(k%len==0){
            return head;
        }
        k=k%len;

        temp.next=head;

        ListNode newNode = nthNode(head,len-k);
        head=newNode.next;
        newNode.next=null;
        return head;

    }
}