class Solution {
    public int firstMissingPositive(int[] nums) {
        
        int end=0;
        while(end<nums.length)
        {
            int num=nums[end];
            if(num>nums.length || num<=0)
            {
                end++;
                continue;
            }
            if(nums[num-1]!=num)
                swap(nums,num-1,end);
            else 
                end++;
        }
        
        for(int i=0;i<nums.length;i++)
        {
            if(i+1!=nums[i])
            {
                return i+1;
            }
        }
        return nums.length+1;
     
    }
     public void swap(int arr[],int start,int end)
    {
        int temp=arr[start];
         arr[start]=arr[end];
        arr[end]=temp;
    }
}