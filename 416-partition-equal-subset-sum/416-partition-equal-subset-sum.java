class Solution {
    public boolean canPartition(int[] nums) {
        
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        
        if(sum%2!=0)
            return false;
        else
        {
            return subSet(nums,sum/2);
        }
        
    }
    
    
    public boolean subSet(int arr[],int sum)
    {
        int length=arr.length;
        boolean dp[][]=new boolean[length+1][sum+1];
        
        for(int j=1;j<=sum;j++)
             dp[0][j]=false;
        
        for(int i=0;i<=length;i++)
             dp[i][0]=true;
        
        for(int i=1;i<=length;i++)
        {
            for(int j=1;j<=sum;j++)
            {
                
                if(arr[i-1]<=j)
                {
                    dp[i][j]=dp[i-1][j] || dp[i-1][j-arr[i-1]];
                    
                }
                else
                     dp[i][j]=dp[i-1][j];
            }
        }
        
        return dp[length][sum];
        
    }
}