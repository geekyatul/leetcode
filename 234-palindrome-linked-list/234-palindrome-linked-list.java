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
    public boolean isPalindrome(ListNode head) {
        //I will use recursion to solve the problem
        //base cases 
        if(head==null || head.next==null)
            return true;
        
        //First we have to find the middle element 
        ListNode middle=middleNode(head);
          ListNode newList=middle.next;
           middle.next=null;
       ListNode reverseHead=reverse(newList);
        //Now we can iterate 
        ListNode first=head;
        ListNode second=reverseHead;
     
        boolean result=true;
        while(second!=null)
        {
            if(first.val!=second.val)
            {
                result=false;
                break;
            }
            first=first.next;
            second=second.next;
        }
        
        //Its not good habit we have to return same linkedlist 
        ListNode rev=reverse(reverseHead);
        middle.next=rev;
        
        
        return result;
        
        
        
    }
    
    public ListNode middleNode(ListNode head)
    {
        if(head==null || head.next==null)
            return head;
        
        ListNode slow=head;
        ListNode fast =head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;

        
    }
    
    public ListNode reverse(ListNode middle)
    {
        ListNode current=middle;
        ListNode prev=null;
        
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