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

    private ListNode reverse(ListNode head){
        ListNode temp =head;
        ListNode prev = null;

        while(temp!=null){
            ListNode front = temp.next;
            temp.next = prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {

        if(head==null || head.next==null){
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;


        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;
        }

        ListNode nhead = reverse(slow);

        ListNode start = head;
        ListNode end = nhead;

        while(end!=null){
            if(start.val!=end.val){
                return false;
            }
            start = start.next;
            end = end.next;
        }
        return true;   
    }
}