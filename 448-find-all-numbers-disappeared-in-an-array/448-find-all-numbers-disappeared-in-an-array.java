class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) 
    {
      
         List<Integer> ans=new ArrayList<>();
        
        int newArray[]=new int[nums.length+1];
        for(int i=0;i<nums.length;i++)
        {
            int number=nums[i];
            newArray[number]=1;
        }
        
        
        for(int i=1;i<newArray.length;i++)
        {
            System.out.println(newArray[i]);
            if(newArray[i]==0)
                ans.add(i);
        }
        return ans;
            
        
          
        
    }
}