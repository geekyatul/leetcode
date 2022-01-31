/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) 
    {   
       
        
        //I will write iterative solution 
         Stack<TreeNode> stack=new Stack<>();
        List<Integer> ans=new ArrayList<>();
           if(root==null)
              return ans;
        TreeNode temp=root;     
    
         while(temp!=null || stack.size()>0)
         {
                while(temp!=null)
                {
                    stack.push(temp);
                    temp=temp.left;
                }
                
                
                    temp=stack.pop();
                 //  System.out.println(temp);
                    ans.add(temp.val);
                    temp=temp.right;
                
         }
    
      return ans;
      
        
    }
}