class Solution {
    public int[][] transpose(int[][] matrix) {
        
        //easy problem
        //transponse means fillping from the digonal 
        int rowLength=matrix.length;
        int colLength=matrix[0].length;
        int resMatrix[][]=new int[colLength][rowLength];
        
        for(int i=0;i<rowLength;i++)
        {
            for(int j=0;j<colLength;j++)
            {
                resMatrix[j][i]=matrix[i][j];
            }
        }
        
        return resMatrix;
        
        
    }
    
    public void swap(int[][] matrix,int row,int col)
    {
        int temp=matrix[row][col];
        matrix[row][col]=matrix[col][row];
        matrix[col][row]=temp;
    }
}