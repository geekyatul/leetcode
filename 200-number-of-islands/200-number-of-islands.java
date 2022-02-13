class Solution {
    public int numIslands(char[][] grid) {
        
        int rowLength=grid.length;
        int colLength=grid[0].length;
        boolean visted[][]=new boolean[rowLength][colLength];
        int startRow=0;
        int colRow=0;
        
        int count=0;
        for(int i=0;i<rowLength;i++)
        {
            for(int j=0;j<colLength;j++)
            {
                  if(grid[i][j]=='1' && visted[i][j]==false)
                  {
                      dfs(grid,i,j,rowLength,colLength,visted);
                       count++;
                      
                  }
                 
            }
        }
        
        return count;
        
        
    }
    
    public void dfs(char[][] grid,int row,int col,int rowLength,int colLength,boolean[][] visted)
    {    
      if(row<0 || col<0 || row>=rowLength || col>=colLength)
            return;
        
        if(grid[row][col]=='0')
            return;
        
        if(visted[row][col]==true)
            return;
        
        visted[row][col]=true;
        
        //condition of travel
        dfs(grid,row-1,col,rowLength,colLength,visted);
        dfs(grid,row+1,col,rowLength,colLength,visted);
        dfs(grid,row,col-1,rowLength,colLength,visted);
        dfs(grid,row,col+1,rowLength,colLength,visted);
        
         
        
        
    }
}