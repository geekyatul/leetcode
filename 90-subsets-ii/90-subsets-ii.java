class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        Set<List<Integer>> set=new HashSet<>();
        List<Integer> tempans=new ArrayList<>();
        
        backtracking(nums,0,ans,tempans,set);
        
        return ans;

    }
    
    public void backtracking(int[] nums, int index,List<List<Integer>> ans,List<Integer> tempans,Set<List<Integer>> set)
    {
        //base condition
        if(index==nums.length)
        {  
            if(!set.contains(tempans))
            {
                ans.add(new ArrayList<Integer>(tempans));
                set.add(new ArrayList<Integer>(tempans));
            }
            
          //  System.out.println(ans);
            return;
        }
        
        //we are adding to list 
        tempans.add(nums[index]);
        backtracking(nums,index+1,ans,tempans,set);
        //when we are back we are removing the elements 
        tempans.remove(tempans.size()-1);
        backtracking(nums,index+1,ans,tempans,set);
        
    }

}