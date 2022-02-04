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
    public boolean hasCycle(ListNode head) {
        if(head==null)
            return false;
        ListNode list1=head;
        ListNode list2=head.next;
        
        int flag=0;
        while(list2!=null && list2.next!=null)
        {
              if(list1==list2)
              {
                  return true;
               }
            list1=list1.next;
            list2=list2.next.next;
        }
        return false;
        
        
    }
}