class Solution {
    public int[][] transpose(int[][] matrix) {
        
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
}