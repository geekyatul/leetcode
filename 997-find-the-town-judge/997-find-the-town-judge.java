class Solution {
    public int findJudge(int n, int[][] trust) {
        
        boolean visted[]=new boolean[n+1];
        
        int indegree[]=new int[n+1];
        Map<Integer,Integer> map=new HashMap<>();
        
       
        for(int[] t:trust)
        {
            int person=t[0];
            //It is calcuating out degree 
            map.put(person,map.getOrDefault(0,person)+1);
            int trustTo=t[1];
            //how many people trust in indegree
            indegree[trustTo]++;
        }
        
        for(int i=1;i<=n;i++)
        {
            if(!map.containsKey(i) && indegree[i]==n-1)
                return i;
        }
        return -1;
        
        
    }
}