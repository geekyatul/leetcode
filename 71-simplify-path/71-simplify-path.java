class Solution {
    public String simplifyPath(String path) {
        
        Stack<String> stack=new Stack<>();
        
        String str[]=path.split("/");
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<str.length;i++)
        {
           if(!stack.isEmpty() && str[i].equals(".."))
               stack.pop();
           else if(!str[i].equals("") && !str[i].equals("..") && !str[i].equals("."))
               stack.push(str[i]);
            
        }
        
        if(stack.isEmpty())
            sb.append("/");
        
        while(!stack.isEmpty())
        {
            String s=stack.pop();
            sb.insert(0,s);
            sb.insert(0,"/");
        }
        
        
        
        
        //System.out.println("str length"+str.length);
        return sb.toString();
        
    }
    
    public boolean isChar(char ch)
    {
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9'))
            return true;
        else
            return false;
            
    }
}