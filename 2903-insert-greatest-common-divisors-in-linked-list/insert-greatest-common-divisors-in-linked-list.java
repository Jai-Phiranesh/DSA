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
    private int gcd(int a, int b){
        while(a>0 && b>0){
            if(a>b){
                a=a%b;
            }
            else{
                b=b%a;
            }
        }
        if(a==0){
            return b;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {

        int firstElement = 0;
        int secondElement = 0;

        ListNode temp = head;
        ListNode prev = null;

        int count=0;

        while(temp!=null){

            firstElement=secondElement;
            secondElement=temp.val;
            count++;
            if(count == 2){
                int gcd = gcd(firstElement,secondElement);
                ListNode node = new ListNode(gcd);
                prev.next=node;
                node.next=temp;
                count=0;
                continue;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
}