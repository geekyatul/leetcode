class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int length=nums.length;
        int ans[]=new int[length-k+1];
        int incre=0;
        
          int start=0;
          int travel=0;
           LinkedList<Integer> dq= new LinkedList<>();
            
           while(travel<nums.length)
           {
               //calcuation
                if(travel-start+1<k)
                {
                    if(dq.isEmpty())
                        dq.addLast(nums[travel]);
                    else
                    {
                        while(!dq.isEmpty() && dq.getLast()<nums[travel])
                       {
                        dq.removeLast();
                        
                        }
                        dq.addLast(nums[travel]);
                    }
                        
                    
                    travel++;
                    
                }
               
               else if(travel-start+1==k)
               {
                   //first we will add that number 
                   if(dq.isEmpty())
                        dq.addLast(nums[travel]);
                    else
                    {
                        while(!dq.isEmpty() && dq.getLast()<nums[travel])
                       {
                        dq.removeLast();
                        
                        }
                        dq.addLast(nums[travel]);
                    }

                   
                   //ans 
                   ans[incre++]=dq.getFirst();
                   
                   //now removing 
                   
                   if(nums[start]==dq.getFirst())
                       dq.removeFirst();
                   
                   start++;
                   travel++;
                   
                   
               }
               
               
               
           }
        
         return ans;
              
         
        
        
    }
}