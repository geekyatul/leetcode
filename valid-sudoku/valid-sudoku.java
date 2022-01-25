class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        Set<String> set=new HashSet<>();
      return validate(board,set);
        
        
    }
    
    public boolean validate(char[][] matrix,Set<String> set)
    {
       for(int i=0;i<matrix.length;i++)
       {
           for(int j=0;j<matrix[i].length;j++)
           {
               if(matrix[i][j]!='.')
               {
                   if(set.contains("row"+String.valueOf(i)+String.valueOf(matrix[i][j])) || set.contains("col"+String.valueOf(j)+String.valueOf(matrix[i][j])) || set.contains("block"+String.valueOf((i/3)*3+j/3)+String.valueOf(matrix[i][j])))
                       return false;
                   else
                   {
                       String rowString="row"+String.valueOf(i)+String.valueOf(matrix[i][j]);
                       String colString="col"+String.valueOf(j)+String.valueOf(matrix[i][j]);
                       String blockString="block"+String.valueOf((i/3)*3+j/3)+String.valueOf(matrix[i][j]);
                       set.add(rowString);
                       set.add(colString);
                       set.add(blockString);
                   }
               }
               
           }
       }
        return true;
    }
}