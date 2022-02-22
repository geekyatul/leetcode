class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        //o(n2)
        //o(n)
        
        int travel=0;
        int max=0;
        while(travel<nums.length)
        {
                int count=0;
                while(travel<nums.length && nums[travel]==1)
                {
                    count++;
                    travel++;
                }
                max=Math.max(max,count);
            travel++;
        }
        return max;
        
    }
}