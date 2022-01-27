class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        Stack<Integer> stack=new Stack<>();
        int length=temperatures.length;
        
        ArrayList<Integer> list=new ArrayList<>();
        
        for(int i=length-1;i>=0;i--)
        {
            
              
                  while(!stack.isEmpty() && temperatures[stack.peek()]<=temperatures[i])
                  {
                      stack.pop();
                      
                      
                  }
                if(stack.isEmpty())
                {
                     list.add(0);
                }
               else
               {  
                   list.add(stack.peek()-i);
                   
               }
            stack.push(i);
        }
        Collections.reverse(list);
        
        int ans[]=new int[list.size()];
        int k=0;
        for(int ele:list)
        {
            ans[k++]=ele;
            
        }
        return ans;
          
        
        
    }
}