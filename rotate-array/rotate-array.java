class Solution {
    public void rotate(int[] nums, int k) {
           if(nums.length==1)
               return;
        int rot=k%nums.length;
         rotate(nums,0,nums.length-1);
         rotate(nums,0,rot-1);
        rotate(nums,rot,nums.length-1);
         
        
    }
    
    public void rotate(int[] arr, int st,int k)
    {
         int start=st;
          int end=k;
         while(start<end)
         {
             int temp=arr[start];
             arr[start]=arr[end];
             arr[end]=temp;
             start++;
             end--;
         }
    }
    
}