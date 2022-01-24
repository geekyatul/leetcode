class Solution {
    public void rotate(int[] nums, int k) {
        
        int rotate=k%nums.length;
        int ans[]=new int[nums.length];
        
        for(int i=0;i<ans.length;i++)
        {
            ans[(i+k)%nums.length]=nums[i];
        }
        
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=ans[i];
        }
        
    }
}