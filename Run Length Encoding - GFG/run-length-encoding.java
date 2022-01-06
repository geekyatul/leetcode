// { Driver Code Starts
import java.util.*;
 
class RLEncoding
{
   public static void main(String[] args) 
   {
 
      Scanner sc = new Scanner(System.in);
    
	  int T = sc.nextInt();
	  sc.nextLine();
	  while(T>0)
	  {
		  
		String str = sc.nextLine();
		
		GfG g = new GfG();
		System.out.println(g.encode(str));
		
      
        T--;
	  }
   }
}

// } Driver Code Ends


class GfG
 {
	String encode(String str)
	{
          //Your code here
          
          if(str.length()==1)
            return str.charAt(0)+String.valueOf(1);
          
          int count=0;
          char ch=str.charAt(0);
          
          String ans="";
          for(int i=0;i<str.length();i++)
          {
              char tempchar=str.charAt(i);
               
               if(tempchar==ch)
               {
                   count++;
               }
               else
               {
                ans=ans+ch+String.valueOf(count);
                 count=1;
                 ch=tempchar;
               }
          }
          
          
              ans=ans+ch+String.valueOf(count);
          
          
          return ans;
          
          
	}
	
 }