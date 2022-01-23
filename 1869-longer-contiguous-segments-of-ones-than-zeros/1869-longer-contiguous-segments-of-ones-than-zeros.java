class Solution {
    public boolean checkZeroOnes(String s) {
        
        int maxOneCount=0;
        int maxZeroCount=0;
        
         int currentOne=0;
         int currentZero=0;
        
        for(int i=0;i<s.length();i++)
        {
           
            int val=Integer.parseInt(String.valueOf(s.charAt(i)));
            
            if(val==0)
            {
                currentZero++;
                currentOne=0;
            }
            else 
            {
                currentOne++;
                currentZero=0;
            }
            
            maxOneCount=Math.max(maxOneCount,currentOne);
            maxZeroCount=Math.max(maxZeroCount,currentZero);
        }
        
        
        return maxOneCount>maxZeroCount;
        
    }
}