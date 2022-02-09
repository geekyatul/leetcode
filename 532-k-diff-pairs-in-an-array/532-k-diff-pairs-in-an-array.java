class Solution {
    public int findPairs(int[] nums, int k) {
        
        Arrays.sort(nums);
        Map<Integer,Integer> map=new HashMap<>();
        
        int count=0;
        for(int i=0;i<nums.length;i++)
        {   
            
             
            if(i!=0 && nums[i]==nums[i-1])
            {
                   if(k==0 && map.get(nums[i])==1)
                       count++;
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
                   continue;
            }
            
            
            if(map.containsKey(nums[i]-k))
                count++;
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
                
        }
        return count;
        
    }
}