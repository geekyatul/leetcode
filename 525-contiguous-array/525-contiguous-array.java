class Solution {
    public int findMaxLength(int[] nums) {
        //This question related to maximum subarray with sum 0
        
        //we will replaced 0 to -1
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
                nums[i]=-1;
        }
        
        //Now I have to find maximum length of subarra with sum 0
        
        Map<Integer,Integer> map=new HashMap<>();
        
        map.put(0,-1);
        int sum=0;
        int maxLength=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            if(map.containsKey(sum))
            {
                maxLength=Math.max(maxLength,i-map.get(sum));
                //here I have to update or not think on it
            }
            else 
                map.put(sum,i);
        }
        return maxLength;
        
        
        
    }
}
