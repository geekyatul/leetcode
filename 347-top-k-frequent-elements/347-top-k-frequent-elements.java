class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        int i=1;
        for(int num:map.keySet())
        {
            pq.offer(new Pair(num,map.get(num)));
            if(i>k)
              pq.poll();
            
            i++;
            
        }
        
        int ans[]=new int[k];
        int incre=0;
        while(!pq.isEmpty())
        {
            Pair p=pq.poll();
            ans[incre++]=p.num;
            
            
        }
        return ans;
        
        
        
        
    }
    
    
    
}

class Pair implements Comparable<Pair>
{
    public int num;
  public   int freq;
    
    public Pair(int num,int freq)
    {
        this.num=num;
        this.freq=freq;
    }
    
    public int compareTo(Pair p)
    {
          return this.freq-p.freq;
    }
    
}