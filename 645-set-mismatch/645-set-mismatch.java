class Solution {
    public int[] findErrorNums(int[] nums) {
        
        int end=0;
        while(end<nums.length)
        {
            int num=nums[end];
            if(num!=nums[num-1])
                swap(nums,end,num-1);
            else 
                end++;
        }
        
        int ans[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]-1!=i)
            {
                ans[0]=nums[i];
                ans[1]=i+1;          
            }
        }
        return ans;
      
    }
    
    public void swap(int arr[],int start,int end)
    {
        int temp=arr[start];
         arr[start]=arr[end];
        arr[end]=temp;
    }
        
        
    
}