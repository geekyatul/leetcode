class Solution {
    public List<String> letterCombinations(String digits) {
        
     String str[]=new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        
        if(digits.length()==0)
        {
            return new ArrayList<String>();
        }
        
         return getString(digits,str,0);
        
        
    }
    
    private List<String> getString(String digits,String str[], int index)
    {
         if(digits.length()==0)
         {
             String terminalString="";
             List<String> baseString=new ArrayList<>();
             baseString.add(terminalString);
             return baseString;
         }
             
        
            
           // solve small problem big problem will be solve automatically 
        String string=str[Integer.parseInt(String.valueOf(digits.charAt(index)))];
         List<String> listOfString=getString(digits.substring(index+1),str,0);
        
        List<String> ansString=new ArrayList<>();
        
        
            for(String s:listOfString)
            {
                for(int i=0;i<string.length();i++)
                {
                  ansString.add(String.valueOf(string.charAt(i))+s);   
                }
            }
                   
           
        
        return ansString;
        
        
    }
    
    
    
    
}