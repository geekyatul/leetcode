class Solution {
    public int searchInsert(int[] nums, int target) {
        
        //base cases
         if(target>nums[nums.length-1])
             return nums.length;
         if(target<nums[0])
             return 0;
        
        int start=0;
        int end=nums.length-1;
        int ans=-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            
            if(nums[mid]==target)
                 return mid;
            else if(nums[mid]>target)
            {
                ans=mid;
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
            
        }
        return ans;
        
    }
}