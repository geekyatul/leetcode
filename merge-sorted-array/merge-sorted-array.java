class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        //easy code to write I know how to write it 
        
        int first=0;
        int second=0;
        
        while(first<m && second<n)
        {
            if(nums2[second]>=nums1[first])
                 first++;
            else 
            {
                swap(nums1,nums2,first,second);
                insertRightPos(nums2,second,n);
                  first++;
            }
        }
        
        while(first<nums1.length && second<nums2.length)
        {
            nums1[first++]=nums2[second++];
        }
         
        
    }
    
    public void swap(int[] arr1,int[] arr2,int first,int second)
    {
        int temp=arr1[first];
        arr1[first]=arr2[second];
        arr2[second]=temp;
    }
    
    public void insertRightPos(int[] arr2,int pos,int end)
    {
           int j=pos+1;
           int temp=arr2[pos];
           while(j<end && temp>arr2[j])
           {
                   arr2[j-1]=arr2[j];
                   j++;
               
           }
            arr2[j-1]=temp;
        
    }
} 