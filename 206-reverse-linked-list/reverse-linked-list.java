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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        // current=current.next;
        while(current!=null){
            ListNode next = current.next;
            current.next=prev;
            prev=current;
            current=next;  
        // here next is head jo ki current k aage bdhne pe uske sath bdhega
        }
            return prev;
    } 
}