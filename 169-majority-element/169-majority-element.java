class Solution {
    public int majorityElement(int[] nums) {
         
        int majority=nums[0];
        int count=1;
        
        int travel=1;
        while(travel<nums.length)
        {
             if(count==0)
             {
                majority=nums[travel];
                 count=1;
             }
             else
             {
               if(nums[travel]==majority)
                count++;
               else 
                count--;
             }
            
           
            travel++;
        }
        
        return majority;
         
    }
}