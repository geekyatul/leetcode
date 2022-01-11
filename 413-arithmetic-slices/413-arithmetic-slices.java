class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        
        if(nums.length<=2)
            return 0;
        int dp[]=new int[nums.length];
        //meaning ap that end with that number 
        dp[0]=0;
        dp[1]=0;
        
        for(int i=2;i<nums.length;i++)
        {
              if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2]) 
              {
                  dp[i]=dp[i-1]+1;
                  
              }
            else
                dp[i]=0;
        }
        
        
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(dp[i]!=0)
                 count+=dp[i];
        }
        
        return count;
        
    }
}