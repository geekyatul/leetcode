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
    public ListNode swapNodes(ListNode head, int k) {
        
        //First Understand the problem then solve it 
        
        
        
        int size=sizeOfLinkedList(head);
        int fromHead=size-k;
        ListNode lastTemp=head;
        for(int i=1;i<=fromHead;i++)
        {
            lastTemp=lastTemp.next;
        }
        
        ListNode temp=head;
        for(int i=1;i<k;i++)
        {
         temp=temp.next; 
        }
        
        swap(lastTemp,temp);
        return head;
        
    }
    
    public void swap(ListNode first,ListNode second )
    {
        int temp=first.val;
        first.val=second.val;
        second.val=temp;
    }
    
    public int sizeOfLinkedList(ListNode head)
    {
        ListNode temp=head;
        int count=0;
        while(temp!=null)
        {
            temp=temp.next;
            count++;
        }
        return count;
    }
}