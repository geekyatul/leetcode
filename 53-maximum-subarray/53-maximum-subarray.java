class Solution {
    public int maxSubArray(int[] nums) {
        
        //kadane algorithm will applied 
        
        int sum=0;
        int maxValue=Integer.MIN_VALUE;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {  
            if(nums[i]>maxValue)
                 maxValue=nums[i];
            
            sum+=nums[i];
            
          maxSum=Math.max(sum,maxSum); 
            
            if(sum<0)
                sum=0;
                
                
        }
        
        return maxSum;
        
    }
}