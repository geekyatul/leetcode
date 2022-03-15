class Solution {
    public String minRemoveToMakeValid(String s) {
        
        //first we have to decide which data structure to use 
        // we are going to use stack data structue 
        
        //Think how you will apporach it give 30 minute and then code it 
        Stack<Pair> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int index =i;
            if(ch=='(')
                stack.push(new Pair(ch,index));
            else if(ch==')')
            {
                if(!stack.isEmpty() && (stack.peek().ch=='(' && ch==')'))
                    stack.pop();
                else
                    stack.push(new Pair(ch,index));
            }
            
        }
        StringBuilder sb=new StringBuilder(s);
        while(!stack.isEmpty())
        {
            Pair pair=stack.pop();
             sb.deleteCharAt(pair.index);
        }
        return sb.toString();
    
        
    }
}

class Pair
{
   public char ch;
   public int index;
    public Pair(char ch,int index)
    {
        this.ch=ch;
        this.index=index;
    }
}