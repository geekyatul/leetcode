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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b)->a.val-b.val);
        
        ListNode dummyNode=new ListNode();
        ListNode dummy=dummyNode;
        
        for(ListNode l:lists)
        {
            if(l!=null)
                pq.add(l); //It will add first node of every LinkedList 
                           //for other I have to iterate 
        }
        while(!pq.isEmpty())
        {
            ListNode tempNode=pq.poll();
            dummy.next=tempNode;
            dummy=dummy.next;
            tempNode=tempNode.next;
            if(tempNode!=null)
                pq.offer(tempNode);
        }
        
        return dummyNode.next;
        
        
    }
}