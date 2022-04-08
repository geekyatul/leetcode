class KthLargest {
   
    private int k;
    private int arr[];
    private PriorityQueue<Integer> pq;
    
    public KthLargest(int k, int[] nums) {
        this.k=k;
        this.arr=nums;
        pq=new PriorityQueue<>();   
        adjust(pq,k,nums);
    }
    
    public int add(int val) {
         if(pq.size()<k)
         {
             pq.offer(val);
         }
        else if(pq.peek()<val)
        {
            pq.poll();
            pq.offer(val);
        }
        return pq.peek();
        
    }
    
    public void adjust(PriorityQueue<Integer> pq,int k,int nums[])
    {
        for(int i=0;i<nums.length;i++)
        {
            if(pq.size()<k)
                pq.offer(nums[i]);
            else 
            {
                if(pq.peek()<nums[i])
                {
                    pq.poll();
                    pq.offer(nums[i]);
                }
            }
        }
      //  printPQ();
    }
    
    public void printPQ()
    {
        System.out.println(Arrays.toString(pq.toArray()));

    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */

// based on priorityQueue