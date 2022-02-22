class Solution {
    public int titleToNumber(String columnTitle) {
        
        
        int total=0;
        for(int i=columnTitle.length()-1,incre=0;i>=0;i--,incre++)
        {
            char ch=columnTitle.charAt(i);
            
            total+=(ch-'A'+1)*(int)Math.pow(26,incre);
            
            
        }
        return total;
        
    }
}