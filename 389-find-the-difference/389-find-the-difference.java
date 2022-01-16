class Solution {
    public char findTheDifference(String s, String t) {
        
        if(s.length()==0)
            return t.charAt(0);
        
        int xor=0;
        for(int i=0;i<s.length();i++)
        {
              int ch1=(int)s.charAt(i);
              xor=xor^ch1;
        }
        
        for(int j=0;j<t.length();j++)
        {
            int ch2=(int)t.charAt(j);
            xor=xor^ch2;
        }
        return (char)xor;
            
        
    }
}