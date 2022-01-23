class Solution {
    public int longestOnes(int[] nums, int k) {
        
        //using variable sliding window to solve this problems 
        
        int start=0;
        int end=0;
        int count=0;
        int max=0;
        while(end<nums.length)
        {
            //calculation
            if(nums[end]==0)
                count++;
            if(count<=k)
            {    max=Math.max(max,end-start+1);
                end++;
            }
            
            else if(count>k)
            {
                while(start<end && count>k)
                {
                    if(nums[start]==0)
                        count--;
                    start++;
                }
                end++;
            }
            
            
            
        }
        return max;
        
    }
}