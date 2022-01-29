class Solution {
    
    
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        //which pq to choose 
        //k coleset means smallest so we choose max pq 
        
        PriorityQueue<Pair> pq=new PriorityQueue<>(new CustomSort());
        
        for(int i=0;i<arr.length;i++)
        {
            if(i<k)
            {
                pq.offer(new Pair(Math.abs(x-arr[i]),arr[i]));
            }
            else
            {
                Pair p=pq.peek();
                int tempabs=Math.abs(x-arr[i]);
                if(p.absoluteDiff>tempabs)
                {
                    pq.poll();
                    pq.offer(new Pair(tempabs,arr[i]));
                }
            }
        }
        
        
        List<Integer> ans=new ArrayList<>();
        while(!pq.isEmpty())
        {
            Pair p=pq.poll();
            System.out.println(p.absoluteDiff+" "+p.num);
            ans.add(p.num);
        }
        
         Collections.sort(ans);
        return ans;
        
    }
}

class CustomSort implements Comparator<Pair>
{

   public int compare(Pair p1, Pair p2)
   {
       return p2.absoluteDiff-p1.absoluteDiff;
   
   }
    
}

class Pair{
    
    
    public int absoluteDiff;
    public int num;
    public Pair(int absoluteDiff ,int num)
    {
        this.num=num;
        this.absoluteDiff=absoluteDiff;
    }

    
}