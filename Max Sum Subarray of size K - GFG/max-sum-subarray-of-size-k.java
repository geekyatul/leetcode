// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            
            int N=sc.nextInt();
            int K=sc.nextInt();
            ArrayList<Integer> Arr = new ArrayList<Integer>(N); 
  
            // Appending new elements at 
            // the end of the list 
            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();
                Arr.add(x); 
            }

            Solution ob = new Solution();
            System.out.println(ob.maximumSumSubarray(K,Arr,N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static int maximumSumSubarray(int k, ArrayList<Integer> Arr,int N){
        // code here
        
      int start=0;
      int travel=0;
      int sum=0;
      int  maxSum=Integer.MIN_VALUE;
      while(travel<N)
      {
          sum=sum+Arr.get(travel);
          if(travel-start+1<k)
              travel++;
          else if(travel-start+1==k)
          {
              //here we will calculate 
              maxSum=Math.max(maxSum,sum);
              
              //slide the window
              sum=sum-Arr.get(start);
              start++;
              travel++;
          }
      }
        
        return maxSum;
    }
}