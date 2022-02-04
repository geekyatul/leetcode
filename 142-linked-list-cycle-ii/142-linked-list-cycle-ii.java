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
        
        ListNode start=head;
        
        if(node==start)
        {
            return start;
        }
        
        while(start.next!=node.next)
        {
            start=start.next;
            node=node.next;
        }
        return start.next;
        
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