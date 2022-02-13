class Solution {
    public List<List<Integer>> subsets(int[] nums) {
           if(nums.length==0)
               return null;
          
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> tempans=new ArrayList<>();
        
        backtracking(nums,0,ans,tempans);
        
        return ans;
    }
    
    public void backtracking(int[] nums, int index,List<List<Integer>> ans,List<Integer> tempans)
    {
        //base condition
        if(index==nums.length)
        {
            ans.add(new ArrayList<Integer>(tempans));
            System.out.println(ans);
            return;
        }
        
        //we are adding to list 
        tempans.add(nums[index]);
        backtracking(nums,index+1,ans,tempans);
        //when we are back we are removing the elements 
        tempans.remove(tempans.size()-1);
        backtracking(nums,index+1,ans,tempans);
        
    }
}