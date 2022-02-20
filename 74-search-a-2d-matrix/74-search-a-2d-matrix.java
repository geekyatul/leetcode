class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        for(int i=0;i<matrix.length;i++)
        {
           if(binearySearch(matrix,i,0,matrix[i].length-1,target))
               return true;
         }
        
        return false;
        
    }
    
    public boolean binearySearch(int[][] matrix,int row,int start,int end,int target)
    {
         while(start<=end)
         {
             int mid=start+(end-start)/2;
             if(matrix[row][mid]==target)
                 return true;
             else if(matrix[row][mid]>target)
                 end--;
             else 
                 start++;
         }
        return false;
    }
}