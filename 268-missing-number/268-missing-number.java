class Solution {
    public int missingNumber(int[] nums) {
       
        Arrays.sort(nums);
        int i=0;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[i]==i)
            {
                i++;
                continue;
            }
            else
                return i;
        }
        return i;
    }
}