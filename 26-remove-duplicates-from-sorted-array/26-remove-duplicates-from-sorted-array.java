class Solution {
    public int removeDuplicates(int[] nums) {
        
        //First solution o(n2)
        //second solution hashset
        //two pointer will be good 
        
        int start=0;
        int travel=0;
         
        while(travel<nums.length)
        {
            if(nums[start]==nums[travel])
                travel++;
            else
            {
                start++;
                nums[start]=nums[travel];
                travel++;
            }
        }
        return start+1;
        
    }
}