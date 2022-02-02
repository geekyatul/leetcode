class Solution {
    public int findDuplicate(int[] nums) {
        
        //cyclic sort 
        //negative positive 
        //bit concept 
        //hashmap 
        
        int end=0;
        while(end<nums.length)
        {
            int num=nums[end];
            if(num!=nums[num-1])
                swap(nums,end,num-1);
            else 
                end++;
        }
        
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]-1!=i)
            {
                ans=nums[i];
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