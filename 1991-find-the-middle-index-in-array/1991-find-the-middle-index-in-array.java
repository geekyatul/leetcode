class Solution {
    public int findMiddleIndex(int[] nums) {
        
        for(int i=1;i<nums.length;i++)
        {
            nums[i]=nums[i]+nums[i-1];
        }
        
        for(int i=0;i<nums.length;i++)
        {
            if(i==0 && nums[nums.length-1]-nums[i]==0)
            {
                return 0;
            }
            else if(i!=0 && nums[i-1] == nums[nums.length-1]-nums[i])
                return i;
            
            
        }
        return -1;

        
    }
}