class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        
        //This is good  
        
        Stack<Integer> stack=new Stack<>();
        int i=0;
        int j=0;
        while(i<pushed.length)
        {
            while(j<popped.length && !stack.isEmpty() && stack.peek()==popped[j])
            {
                stack.pop();
                j++;
                
            } 
             stack.push(pushed[i]);
            i++;
                
        }
        
        while(j<popped.length)
        {
            if(j<popped.length && stack.peek()==popped[j])
            {
                stack.pop();
                j++;
            }
            else
            {
                return false;
            }
            
        }
        return true;
        
    }
}