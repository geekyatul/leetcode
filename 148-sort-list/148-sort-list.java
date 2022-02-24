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
    public ListNode sortList(ListNode head) {
        
        if(head==null || head.next==null)
            return head;
        
        ListNode mid=findMiddle(head);
        ListNode midNext=mid.next;
        
        mid.next=null;
        ListNode left=sortList(head);
        ListNode right=sortList(midNext);
        
         return merge(left,right);        
        
    }
    
    public ListNode merge(ListNode left,ListNode right)
    {
        ListNode dummyNode=new ListNode();
        ListNode dummy=dummyNode;
        
        ListNode first=left;
        ListNode second=right;
        while(first!=null && second!=null)
        {
            if(first.val<=second.val)
            {
                dummy.next=first;
                dummy=dummy.next;
                first=first.next;
            }
            else
            {
                dummy.next=second;
                dummy=dummy.next;
                second=second.next;
            }
        }
        if(first!=null)
        {
            dummy.next=first;
        }
        else
            dummy.next=second;
        
        return dummyNode.next;
        
        
    }
    
    public ListNode findMiddle(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        
        while(fast.next!=null && fast.next.next!=null)
        {
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
            
        }
        return slow ;
    }
    
    
}