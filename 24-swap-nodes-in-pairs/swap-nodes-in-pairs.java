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
    public ListNode swapPairs(ListNode head) {
         ListNode first = head;
        // if(first==null)return;

        //data swap
        while(first!=null&&first.next!=null){
        int temp=first.val;
        first.val=first.next.val;
        first.next.val = temp;
        first = first.next.next;
        }
    return head;
    }
}