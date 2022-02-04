/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
       ListNode node=isCycle(head);
        if(node==null)
            return null;
        
        ListNode entry=head;
        while(node!=entry)
        {
            node=node.next;
            entry=entry.next;
        }
        return entry;
         
    }
    
    public ListNode isCycle(ListNode head)
    {
        ListNode l1=head;
        ListNode l2=head;
        
        while(l2!=null && l2.next!=null)
        {
             l1=l1.next;
             l2=l2.next.next;
                 if(l1==l2)
                     return l1;
        }
        return null;
    }
}