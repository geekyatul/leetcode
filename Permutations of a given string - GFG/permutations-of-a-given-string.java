// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                System.out.print(ans.get(i)+" ");
            }
            System.out.println();
                        
        }
	}
}

// } Driver Code Ends


class Solution {
    public List<String> find_permutation(String S) {
        // Code here
        List<String> ans=new ArrayList<>();
        String ansString="";
        permutationHelper(S,ansString,ans);
        Collections.sort(ans);
        return ans;
        
    }
    
    public void permutationHelper(String S,String ansString,List<String> ans)
    {   
           if(S.length()==0)
              {
                  ans.add(ansString);
              }
        
        for(int i=0;i<S.length();i++)
        {
            char ch=S.charAt(i);
            String remainingString=S.substring(0,i)+S.substring(i+1);
            permutationHelper(remainingString,ansString+ch,ans);
            
            
        }
    }
}