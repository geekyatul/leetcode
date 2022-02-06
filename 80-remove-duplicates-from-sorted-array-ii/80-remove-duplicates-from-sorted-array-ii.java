class Solution {
    public int removeDuplicates(int[] nums) {
        
       int count=1;
        int prev=nums[0];
        int rightIndex=1;
        int travel=1;
        while(travel<nums.length)
        {
            if(nums[travel]==prev)
            {
                count++;
            }
            if(nums[travel]!=prev)
                count=1;
            
            if(count<=2)
            {
                nums[rightIndex]=nums[travel];
                rightIndex++;
            }
            
            prev=nums[travel];
            travel++;
                
        }
        return rightIndex;
        
    }
}