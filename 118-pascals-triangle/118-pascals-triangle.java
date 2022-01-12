class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        //first and last is same 
        //middle one is sum of addjecn
        List<List<Integer>> ans=new ArrayList<>();
        
         for(int i=1;i<=numRows;i++)
         {
             List<Integer> tempAns=new ArrayList<>();
             for(int j=1;j<=i;j++)
             {
                 if(j==1)
                      tempAns.add(1);
                 else if(j==i)
                     tempAns.add(1);
                 else
                 {
                     tempAns.add(ans.get(i-1-1).get(j-1)+ans.get(i-1-1).get(j-2));
                 }
                      
             }
             ans.add(tempAns);
         }
        
        return ans;
        
        
    }
}