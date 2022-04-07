class Solution {
    public int lastStoneWeight(int[] stones) {
        //THis problem is related to priority queueue because it require the heigh weight 
        
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        
        for(Integer integer:stones)
        {
            pq.offer(integer);
        }
        while(pq.size()>1)
        {
            int first=pq.poll();
            int second=pq.poll();
            if(first<second)
            {
                //second is largest
                pq.offer(second-first);
            }
            else if(first>second)
            {
                pq.offer(first-second);
            }
        }
        
        if(pq.size()==1)
            return pq.poll();
        
        return 0;
        
    }
}