class Solution {
    public int rob(int[] nums) {
        int include =nums[0];
        int exclude=0;
        
        for(int i=1;i<nums.length;i++)
        {
            int newinclude=nums[i]+exclude;
            int newexclude=Math.max(include,exclude);
            
            include=newinclude;
            exclude=newexclude;
            
        }
        
        return Math.max(include,exclude);
        
        
        
    }
}