class Solution {
    public int missingNumber(int[] nums) {
     
//         int xor=nums.length;
        
//         for(int i=0;i<nums.length;i++)
//         {
//             xor=xor^i;
//             xor=xor^nums[i];
//         }
//         return xor;
        
        int missingNumber=nums.length;
        
        int end=0;
        while(end<nums.length)
        {
            int num=nums[end];
            if(num==nums.length)
            {
                end++;
                continue;
            }
               
            if(num!=end)
            {
                swap(nums,end,num);
            }
            else
                end++;
        }
        
        int miss=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            if(i!=nums[i])
            {
                 miss=i;
                break;
                
            }
               
            
        }
        
        return  miss==nums.length?nums.length:miss;
    }
    
    public void swap(int arr[],int start,int end)
    {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}