class Solution {
    public String frequencySort(String s) {
        //This question is solved by the priorityQueue
        
        HashMap<Character,Integer> map=new HashMap<>();
        PriorityQueue<Pair> pq =new PriorityQueue<>();
        for(int i=0;i<s.length();i++)
        {
             char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        for(Character ch:map.keySet())
        {
            pq.offer(new Pair(ch,map.get(ch)));
        }
        
        StringBuilder sb=new StringBuilder();
        
        while(!pq.isEmpty())
        {
            Pair p=pq.poll();
            char ch=p.ch;
            int freq=p.freq;
            while(freq>0)
            {
                sb.append(ch);
                freq--;
            }
        }
        return sb.toString();
      
        
        
    }
    
}

class Pair implements Comparable<Pair>
{
   public  char ch;
    public int freq;
    public Pair(char ch,int freq)
    {
        this.ch=ch;
        this.freq=freq;
    }
    
    public int compareTo(Pair p)
    {
           return p.freq-this.freq;
    }
}