/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      
        ListNode list1=headA;
        ListNode list2=headB;
        
        while(list1!=list2)
        {
            list1=list1!=null?list1.next:headB;
            list2=list2!=null?list2.next:headA;
            if(list1==list2)
                return list1;
        }
        return list1;
        
            
        
    }
}