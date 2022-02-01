class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) 
    {
      
         List<Integer> ans=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++)
        {
            int number=Math.abs(nums[i]);
          
            if(nums[number-1]>0)
                nums[number-1]=-nums[number-1];
                
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
                ans.add(i+1);
        }
            
        return ans;
        
          
        
    }
}