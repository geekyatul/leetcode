class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<words.length;i++)
        {
            String str=words[i];
            map.put(str,map.getOrDefault(str,0)+1);
        }
        
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        
        for(String st:map.keySet())
        {
            pq.offer(new Pair(st,map.get(st)));
            if(pq.size()>k)
                pq.poll();
        }
        
        List<String> ans=new ArrayList<>();
         while(!pq.isEmpty())
         {
             Pair p=pq.poll();
             ans.add(p.str);
         }
        
         Collections.reverse(ans);
        return ans;
        
    }
    
    
    
    
}

class Pair implements Comparable<Pair>
{
    String str;
    int freq;
    public Pair(String str,int freq)
    {
        this.str=str;
        this.freq=freq;
    }
    
    public int compareTo(Pair other)
    {
          if(other.freq==this.freq)
          {
              return other.str.compareTo(this.str);
          }
          return this.freq-other.freq;
    }
    
}
