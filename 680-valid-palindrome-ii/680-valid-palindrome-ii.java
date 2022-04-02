class Solution {
    public boolean validPalindrome(String s) {
    
        int start=0;
        int end=s.length()-1;
        while(start<end)
        {
            if(s.charAt(start)!=s.charAt(end))
            {
                boolean first=isPalidrom(s,start,end-1);
                boolean second=isPalidrom(s,start+1,end);
                 return first || second;
            }
            start++;
            end--;
                
        }
        return true;
        
    
    }
    
    public boolean isPalidrom(String str,int start,int end)
    {
        
        while(start<end)
        {
            if(str.charAt(start)!=str.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}