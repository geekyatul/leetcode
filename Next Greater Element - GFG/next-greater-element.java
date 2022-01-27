// { Driver Code Starts
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    long[] res = new Solution().nextLargerElement(arr, n);
		    for (int i = 0; i < n; i++) 
		        System.out.print(res[i] + " ");
		    System.out.println();
		}
	}
}



// } Driver Code Ends


class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        
        Stack<Long> stack=new Stack<>();
        long ans[]=new long[n];
        int k=0;
        
        for(int i=n-1;i>=0;i--)
        {
            
            while(!stack.isEmpty() && stack.peek()<arr[i])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                ans[k++]=-1;
            }
            else 
            {
                ans[k++]=stack.peek();
            }
            stack.push(arr[i]);
        }
        
       int start=0;
       int end=n-1;
       while(start<end)
       {
           long temp=ans[start];
           ans[start]=ans[end];
           ans[end]=temp;
           start++;
           end--;
       }
       
       return ans;
        
        
        
    } 
}