class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
           //recursive memoziation 
        int length1=text1.length();
        int length2=text2.length();
        int dp[][]=new int[length1+1][length2+1];
        Arrays.stream(dp).forEach(a -> Arrays.fill(a, -1));


        
        int longestcs=lcs(text1,text2,length1,length2,dp);
        
        return longestcs;
            
        
        
    }
    
    
    public int lcs(String s1,String s2,int len1,int len2,int dp[][])
    {
        
        //base condition
        if(len1==0 || len2==0)
             return 0;
        
        if(dp[len1][len2]!=-1)
            return dp[len1][len2];
        
        if(s1.charAt(len1-1)==s2.charAt(len2-1))
             return 1+lcs(s1,s2,len1-1,len2-1,dp);
        else
        {
            dp[len1][len2]=Math.max(lcs(s1,s2,len1,len2-1,dp),lcs(s1,s2,len1-1,len2,dp));
            return dp[len1][len2];
        }
    }
}