class Solution {
    public int[] frequencySort(int[] nums) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        for(int num:map.keySet())
        {
            pq.offer(new Pair(num,map.get(num)));
            
        }
        
        int ans[]=new int[nums.length];
        int incre=0;
        
        while(!pq.isEmpty())
        {
            Pair p=pq.poll();
            System.out.println(p.num+" "+p.freq);
            int freq=p.freq;
            int num=p.num;
            
            while(freq>0)
            {
                ans[incre++]=num;
                freq--;
            }
        }
        return ans;
        
        
    }
}

class Pair implements Comparable<Pair>{
    
    int num;
    int freq;
    
    public Pair(int num,int freq)
    {
        this.num=num;
        this.freq=freq;
    }
    
    public int compareTo(Pair p)
    {
        if(p.freq==this.freq)
            return p.num-this.num;
        return this.freq-p.freq;
    }
}