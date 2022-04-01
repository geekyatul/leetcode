class Solution {
    public void reverseString(char[] s) {
         int start=0;
        int end=s.length-1;
          while(start<end)
          {
              swap(s,start,end);
              start++;
              end--;
          }
        
    }
    
    void swap(char[] s,int start,int end)
    {
        char ch=s[start];
        s[start]=s[end];
        s[end]=ch;
    }
}