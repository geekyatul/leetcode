class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        
          int arr[]=new int[10];
        for(int i=0;i<10;i++)
            arr[i]=i;
        
         List<List<Integer>> ans=new ArrayList<>();
        List<Integer> tempans=new ArrayList<>();
        
        
        backtracking(arr,1,0,n,k,ans,tempans);
        
        return ans;
    }
    
    public void backtracking(int[] nums, int index,int sum,int target,int k,List<List<Integer>> ans,List<Integer> tempans)
    {
        //base condition
        if(index==nums.length)
        {    
            if(sum==target && tempans.size()==k)
            { ans.add(new ArrayList<Integer>(tempans));
            System.out.println(ans);
            }
            return;
        }
        
        //we are adding to list 
        tempans.add(nums[index]);
         sum=sum+nums[index];
        backtracking(nums,index+1,sum,target,k,ans,tempans);
        //when we are back we are removing the elements 
        tempans.remove(tempans.size()-1);
        sum=sum-nums[index];
        backtracking(nums,index+1,sum,target,k,ans,tempans);
        
    }

}