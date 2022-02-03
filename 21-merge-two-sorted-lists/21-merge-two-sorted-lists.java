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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        if(list1==null && list2==null)
            return null;
        
        ListNode dummyNode=new ListNode(-1);
        ListNode dummy=dummyNode;
        
        ListNode temp1=list1;
        ListNode temp2=list2;
        while(temp1!=null && temp2!=null)
        {
               if(temp1.val<=temp2.val)
               {
                   //we will create of temp1;
                   ListNode tempNode=new ListNode(temp1.val);
                   dummy.next=tempNode;
                   dummy=dummy.next;
                   temp1=temp1.next;
               }
               else
               {
                   ListNode tempNode=new ListNode(temp2.val);
                   dummy.next=tempNode;
                   dummy=dummy.next;
                   temp2=temp2.next;
               }
        }
        
        while(temp1!=null)
        {
             ListNode tempNode=new ListNode(temp1.val);
                   dummy.next=tempNode;
                   dummy=dummy.next;
                   temp1=temp1.next;
        }
        while(temp2!=null)
        {
                  ListNode tempNode=new ListNode(temp2.val);
                   dummy.next=tempNode;
                   dummy=dummy.next;
                   temp2=temp2.next;
        }
        
        return dummyNode.next;
        
    }
}