class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
     // this problem based on variable length sliding window 
     //let me solve this using variable sliding window 
        
        //intialize 
        int start=0;
         int end=0;
        int min=nums.length+1;
          int sum=0;
          while(end<nums.length)
          {
              sum=sum+nums[end];
              
              if(sum<target)
              {
                  end++;
              }
              else if(sum>=target)
              {
                   //ans calculation 
                  while(sum>=target)
                  {  
                      min=Math.min(min,end-start+1);
                      sum=sum-nums[start];
                      start++;
                      
                  }
                  end++;
              }
          }
         return min!=nums.length+1?min:0;
        
        
    }
}