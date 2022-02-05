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
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head==null || head.next==null)
            return head;
        
        ListNode start=head;
        ListNode end=head;
        while(end!=null)
        {
            if(start.val==end.val)
                end=end.next;
            else
            {
                start.next=end;
                start=start.next;
                end=end.next;
            }
        }
        start.next=null;
        return head;
    }
}