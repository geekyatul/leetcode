class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        
          for(int i=0;i<points.length;i++)
          {
              int start=points[i][0];
              int end=points[i][1];
              long dis=(long)start*start+(long)end*end;
               pq.offer(new Pair(start,end,dis));
                 if(pq.size()>k)
                     pq.poll();
                                     
              
          }
        
        int ans[][]=new int[k][2];
        int incre=0;
        
        while(!pq.isEmpty())
        {
            Pair p=pq.poll();
            System.out.println(p.start+" "+ p.end);
            ans[incre][0]=p.start;
            ans[incre][1]=p.end;
            incre=incre+1;
        }
        
        return ans;
        
        
        
    }
}

class Pair implements Comparable<Pair>
{
   public int start;
    public int end;
    public long distance;
    public Pair(int start,int end,long distance)
    {
        this.start=start;
        this.end=end;
        this.distance=distance;
    }
    
    public int compareTo(Pair p)
    {
          return (int)(p.distance-this.distance);
    }
}