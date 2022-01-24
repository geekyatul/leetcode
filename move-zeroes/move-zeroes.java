class Solution {
    public void moveZeroes(int[] nums) {
         if(nums.length==1)
               return;
         int start=0;
         int end=0;
          while(end<nums.length)
          {
              if(nums[end]!=0)
              {
                  nums[start]=nums[end];
                  start++;
              }
              end++;
                
          }
        if(start!=0)
        {
        for(int i=start;i<nums.length;i++)
        {
            nums[i]=0;
        }
        }
        
    }
    
    public void swap(int arr[],int start,int end)
    {
              int temp=arr[start];
              arr[start]=arr[end];
              arr[end]=temp;
    }
}