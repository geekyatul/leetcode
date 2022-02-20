class Solution {
    public void sortColors(int[] nums) {
        
        int start=0;
        int end=nums.length-1;
        int traverse=0;
        
        while(traverse<=end)
        {
            if(nums[traverse]==0)
            {
                swap(nums,start,traverse);
                traverse++;
                start++;
            }  
            else if(nums[traverse]==1)
            {
                traverse++;
            }
            else
            {
                swap(nums,traverse,end);
                end--;
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