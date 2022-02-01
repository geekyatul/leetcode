class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int num=Math.abs(nums[i]);
            if(nums[num-1]>0)
                nums[num-1]=-nums[num-1];
            else 
            {
                //second time we are vistiong 
                ans.add(num);
            }
        }
        return ans;
        
    }
}