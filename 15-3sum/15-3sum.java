class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        //First I will approach two pointer and hasset 
        
        //First approaching all the triplet
        
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
       // List<Integer> singleAns=new ArrayList<>();
       // HashSet<List<Integer>> set=new HashSet<>();
        int startNum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-2;i++)
        {   
              if(startNum==nums[i])
              {
                  continue;
              }
              
            int start=i+1;
            int end=nums.length-1;
            int remainingSum=0-nums[i];
            int prev=Integer.MIN_VALUE;
            int next=Integer.MIN_VALUE;
            while(start<end)
            {    
                if(prev==nums[start])
                {
                    start++;
                    continue;
                }
                if(next==nums[end])
                {
                    end--;
                    continue;
                }
                int sum=nums[start]+nums[end];
                if(sum==remainingSum)
                {
                    List<Integer> singleAns=new ArrayList<>();
                    singleAns.add(nums[i]);
                    singleAns.add(nums[start]);
                    singleAns.add(nums[end]);
                    //set.add(singleAns);
                    ans.add(singleAns);
                    prev=nums[start];
                    next=nums[end];
                    startNum=nums[i];
                    start++;
                    end--;
                }
                else if(sum<remainingSum)
                    start++;
                else
                    end--;
            }
        }
        
          return ans;
        
    }
}