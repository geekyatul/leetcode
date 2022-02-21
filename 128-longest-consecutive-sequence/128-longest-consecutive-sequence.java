class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashMap<Integer,Boolean> map=new HashMap<>();
        
        if(nums.length==0)
            return 0;
        
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],true);
        }
        
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]-1))
                map.put(nums[i],false);
        }
        
        int max=1;
        for(int i=0;i<nums.length;i++)
        {
            if(map.get(nums[i])==true)
            {
                int count=1;
                int num=nums[i];
                while(map.get(num+1)!=null && map.get(num+1)==false)
                {
                    count++;
                    num=num+1;
                }
                max=Math.max(max,count);
            }
        }
        return max;
        
    }
}