class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        int rowLength=image.length;
        int colLength=image[0].length;
        int oldColor=image[sr][sc];
        if(oldColor!=newColor)
        dfs(image,sr,sc,rowLength,colLength,oldColor,newColor);
        
        return image;
        
        
    }
    
    public void dfs(int[][] image, int sr, int sc,int rowLength,int colLength,int oldColor, int newColor)
    {
             
        //wrong condition 
        if(sr<0 || sc<0 || sr>=rowLength || sc>=colLength)
        {
             return;
        }
        
        if(image[sr][sc]!=oldColor)
            return;
        
        image[sr][sc]=newColor;
        
        System.out.println(image[sr][sc]+" "+sr+" "+sc);
        dfs(image,sr-1,sc,rowLength,colLength,oldColor,newColor);
        dfs(image,sr+1,sc,rowLength,colLength,oldColor,newColor);
        dfs(image,sr,sc-1,rowLength,colLength,oldColor,newColor);
        dfs(image,sr,sc+1,rowLength,colLength,oldColor,newColor);
        
        
        
    }
}