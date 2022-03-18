class Solution {
    public List<List<Integer>> combine(int n, int k) {
        
              
        int arr[]=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            arr[i]=i;
        }
          
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> tempans=new ArrayList<>();
        
        backtracking(arr,1,ans,tempans,k);
        
        return ans;
    }
    
    public void backtracking(int[] nums, int index,List<List<Integer>> ans,List<Integer> tempans,int k)
    {
        //base condition
        if(index==nums.length)
        {   if(tempans.size()==k)
           {
            ans.add(new ArrayList<Integer>(tempans));
           // System.out.println(ans);
           } 
            return;
        }
        
        //we are adding to list 
        tempans.add(nums[index]);
        backtracking(nums,index+1,ans,tempans,k);
        //when we are back we are removing the elements 
        tempans.remove(tempans.size()-1);
        backtracking(nums,index+1,ans,tempans,k);
        
    }

}