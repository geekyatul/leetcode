class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        //First I will approach two pointer and hasset 
        
        //First approaching all the triplet
        
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
       // List<Integer> singleAns=new ArrayList<>();
        HashSet<List<Integer>> set=new HashSet<>();
        
        for(int i=0;i<nums.length-2;i++)
        {
            int start=i+1;
            int end=nums.length-1;
            int remainingSum=0-nums[i];
                
            while(start<end)
            {
                int sum=nums[start]+nums[end];
                if(sum==remainingSum)
                {
                    List<Integer> singleAns=new ArrayList<>();
                    singleAns.add(nums[i]);
                    singleAns.add(nums[start]);
                    singleAns.add(nums[end]);
                    set.add(singleAns);
                    start++;
                    end--;
                }
                else if(sum<remainingSum)
                    start++;
                else
                    end--;
            }
        }
        
        for(List<Integer> ele:set)
        {
            ans.add(ele);
        }
        return ans;
        
    }
}