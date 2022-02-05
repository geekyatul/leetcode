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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head==null || head.next==null)
            return head;
        int length=size(head);
        int rotate=k%length;
        
        if(k%length==0)
            return head;
        
        int rotFrom=length-rotate;
        
        ListNode temp=head;
        for(int i=1;i<rotFrom;i++)
        {
            temp=temp.next;
        }
       ListNode rotateNode=temp.next;
        temp.next=null;
        
        ListNode secondTemp=rotateNode;
        while(secondTemp.next!=null)
        {
            secondTemp=secondTemp.next;
        }
        secondTemp.next=head;
        head=rotateNode;
        
        return head;
        
    }
    
    public int size(ListNode head)
    {
        int count=0;
        ListNode temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            count++;
        }
        return count;
    }
    public ListNode reverse(ListNode head)
    {
        if(head==null || head.next==null)
            return head;
        
        ListNode prev=null;
        ListNode current=head;
        while(current!=null)
        {
            ListNode next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
}