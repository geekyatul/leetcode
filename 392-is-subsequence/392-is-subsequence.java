class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int first=0;
        int count=0;
        int j=0;
        int temp=0;
        while(first<s.length())
        {
            char ch=s.charAt(first);
            
            while(j<t.length())
            {
                char ch1=t.charAt(j);
                if(ch1==ch)
                {
                    j++;
                    temp=j;
                    count++;
                    break;
                }
                else
                    j++;
            }
            j=temp;
            first++;
        }
        
        if(count==s.length())
            return true;
        else
            return false;
        
    }
}