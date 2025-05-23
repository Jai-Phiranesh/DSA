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
    private ListNode findKthNode(ListNode head,int k){
        int c = 1;
        ListNode temp = head;
        
        while(temp!=null){
            if(c==k){
                return temp;
            }
            c++;
            temp=temp.next;
        }
        return null;
    }

    private ListNode reverse(ListNode head){
        ListNode temp = head;
        ListNode prev = null;
        
        while(temp!=null){
            ListNode front = temp.next;
            temp.next = prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prev = null;

        while(temp!=null){
            ListNode kthNode = findKthNode(temp,k);
            if(kthNode==null){
                if(prev!=null){
                    prev.next=temp;
                    break;
                }
            }

            ListNode nextNode = kthNode.next;
            kthNode.next=null;

            reverse(temp);

            if(temp==head){
                head=kthNode;
            }
            else{
                prev.next=kthNode;
            }

            prev=temp;
            temp = nextNode;

            

        }
        return head;

    }
}