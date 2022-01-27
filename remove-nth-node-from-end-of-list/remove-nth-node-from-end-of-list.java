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
    public ListNode removeNthFromEnd(ListNode head, int n) {
           
        ListNode nextNode=head;
            while(n>0)
            {
                nextNode=nextNode.next;
                n--;
            }
        
        if(nextNode==null)
        {
            ListNode temp=head.next;
            return temp;
        }
        
        ListNode startNode=head;
        ListNode prev=null;
        while(nextNode!=null)
        {
            nextNode=nextNode.next;
            prev=startNode;
            startNode=startNode.next;
        }
        prev.next=startNode.next;
        return head;
        
        
    }
}