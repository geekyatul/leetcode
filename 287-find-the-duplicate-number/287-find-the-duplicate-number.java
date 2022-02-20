class Solution {
    public int findDuplicate(int[] nums) {
        
        int start=0;
        while(start<nums.length)
        {
            int num=nums[start];
            if(num==nums[num-1])
                 start++;
            else 
            {
                swap(nums,num-1,start);
            }
        }
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]-1!=i)
                return nums[i];
        }
        return -1;
        
      
    }
    
    public void swap(int arr[],int start,int end)
    {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        
    }
    
}