// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V + 1; i++)
                list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}// } Driver Code Ends


/*Complete the function below*/

class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        
        //We are making two which will track node is visted or not 
        //second one tell in current traversal it is visted or not 
    boolean visted[]=new boolean[V];
    boolean dfsVisted[]=new boolean[V];
    
    for(int i=0;i<V;i++)
    {
        if(visted[i]==false)
        {
            if(isDirectedCycle(i,adj,visted,dfsVisted))
               return true;
        }
    }
    return false;
        
        
    }
    
    public boolean isDirectedCycle(int current, ArrayList<ArrayList<Integer>> adj,
    boolean visted[],boolean dfsVisted[])
    {
        visted[current]=true;
        dfsVisted[current]=true;
        
        for(Integer it:adj.get(current))
        {
            if(visted[it]==false)
            {
                if(isDirectedCycle(it,adj,visted,dfsVisted))
                    return true;
            }
            else if(visted[it]==true && dfsVisted[it]==true)
                return true;
        }
        dfsVisted[current]=false;
        return false;
    }
}