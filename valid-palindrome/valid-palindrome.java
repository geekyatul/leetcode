class Solution {
    /*
     First we have to filter then solve the problem 
     
    
    */
    
    
    public boolean isPalindrome(String str) {
        
        if(str.trim().length()==0)
            return true;
        String s=str.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
             char ch=s.charAt(i);
            
            if(isValid(ch))
            {
                sb.append(ch);
            }
        }
        
        return isPalidrom(sb.toString());
    }
    
    public boolean isPalidrom(String s1)
    {
        
        int start=0;
        int end=s1.length()-1;
        while(start<end)
        {
            char ch1=s1.charAt(start);
            char ch2=s1.charAt(end);
            if(ch1!=ch2)
                return false;
            start++;
            end--;
                
        }
        return true;
    }
    
    public boolean isValid(char ch)
    {
        if((ch>='a' && ch<='z') || ch>='0' && ch<='9')
        {
            return true;
        }
        return false;
    }
}