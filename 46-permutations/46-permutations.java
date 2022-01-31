class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<Integer> singleAns=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        permutationHelper(nums,singleAns,ans); 
        return ans; 
        
        
    }
    
            public void permutationHelper(int[] nums,List<Integer> singleAns,List<List<Integer>> ans)
            {
                       if(nums.length==0)
                       {
                           ans.add(new ArrayList<>(singleAns));
                           return ;
                       }
                
                for(int i=0;i<nums.length;i++)
                {
                    int num=nums[i];
                    singleAns.add(num);
                    //temp array
                    int temparr[]=modifyArray(nums,i);
                    
                    permutationHelper(temparr,singleAns,ans);
                    singleAns.remove(singleAns.size()-1);
                    
                }
                
            }
    
    
    public int[] modifyArray(int [] arr,int index)
    {
        int temparr[]=new int[arr.length-1];
        int tempArrayIndex=0;
        for(int i=0;i<arr.length;i++)
        {     if(index!=i)
            temparr[tempArrayIndex++]=arr[i];
        }
        return temparr;
    }

    
    
}