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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       
        //we are getting reverse number itself
        int carry=0;
        ListNode sumNode=new ListNode(-1);
        ListNode dummy=sumNode;
        
        ListNode first=l1;
        ListNode second=l2;
        
        while(first!=null || second!=null || carry!=0)
        {
            int sum=carry+(first!=null?first.val:0)+(second!=null?second.val:0);
            int lastDigit=sum%10;
            carry=sum/10;
            
            dummy.next=new ListNode(lastDigit);
            dummy=dummy.next;
            
            
            if(first!=null)
                first=first.next;
            if(second!=null)
                second=second.next;
        }
       return sumNode.next;
        
    }
}