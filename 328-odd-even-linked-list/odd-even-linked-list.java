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
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode odd = head;
        ListNode eve = head.next;
        ListNode eveh = head.next;

        while(eve!=null && eve.next!=null){
            odd.next = odd.next.next;
            eve.next = eve.next.next;

            odd= odd.next;
            eve=eve.next;

        }
        odd.next=eveh;
        return head;
    }
}