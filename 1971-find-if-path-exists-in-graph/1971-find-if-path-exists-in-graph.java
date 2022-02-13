class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        
        //First I have to make adjency list 
        ArrayList<ArrayList<Integer>> adj=adjencyList(n,edges);
        //here n is no of vertices 
        boolean visted[]=new boolean[n]; //Why I am making n+1 visted array
        boolean isValid[]=new boolean[1];
        for(int i=0;i<n;i++)
        {
         
            if(visted[i]==false)
            {
                System.out.println("no of call and visted element   "+visted[i]);
                bfs(i,adj,source,destination,visted,isValid);
                if(isValid[0]==true)
                    return true;
            }
        }
                                      
       
    
        return false;
        
    }
    
    public void bfs(int i,ArrayList<ArrayList<Integer>> adj , int source, int destination,boolean visted[],boolean isValid[])
    {
        HashSet<Integer> set=new HashSet<>();
        System.out.println("starting of set  " + set);
        
          Queue<Integer> que=new LinkedList<>();
          que.add(i);
          visted[i]=true;
        
        while(!que.isEmpty())
        {
            //remove 
            Integer num=que.poll();
            //add to ans
            set.add(num);
            
            //add other vertex
            for(Integer it:adj.get(num))
            {
                if(visted[it]==false)
                {
                    visted[it]=true;
                    que.add(it);
                }
            }
            
            
        }
        
        System.out.print(set);
        if(set.contains(source) && set.contains(destination))
        {
             isValid[0]=true;
            System.out.println("source and destination persent in same componenet");
        }
            
        
        
    }
                                      
    public ArrayList<ArrayList<Integer>> adjencyList(int vertex,int [][] edges)
    {
            ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
           
             for(int i=0;i<vertex;i++)
             {
                 adj.add(new ArrayList<Integer>());
             }
        
             
            for(int i=0;i<edges.length;i++)
            {
                int fVertex=edges[i][0];
                int sVertex=edges[i][1];
                adj.get(fVertex).add(sVertex);
                adj.get(sVertex).add(fVertex);
            }
        
            // for(ArrayList<Integer> ad:adj)
            // {
            //     System.out.println(ad);
            // }
        
        return adj;
     }                                 
                                      
}