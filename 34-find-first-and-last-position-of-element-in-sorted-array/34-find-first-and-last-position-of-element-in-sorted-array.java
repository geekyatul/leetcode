class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int first=findFirst(nums,target);
        int last=findLast(nums,target);
        int ans[]=new int[2];
        ans[0]=first;
        ans[1]=last;
        return ans;
        
    }
    
    public int findFirst(int[] nums, int target)
    {
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
             if(nums[mid]==target)
             {
                 ans=mid;
                 high=mid-1;
                 
             }
            else if(nums[mid]>target)
            {
                high=mid-1;
            }
            else
                low=mid+1;
        }
        return ans;
        
    }
    
    public int findLast(int[] nums, int target)
    {
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
             if(nums[mid]==target)
             {
                 ans=mid;
                 low=mid+1;
                 
             }
            else if(nums[mid]>target)
            {
                high=mid-1;
            }
            else
                low=mid+1;
        }
        return ans;

    }
}