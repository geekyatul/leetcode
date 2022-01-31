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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
                
        Stack<TreeNode> stack1=new Stack<>();
        Stack<TreeNode> stack2=new Stack<>();
        
        stack1.push(root);
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)
            return ans;
        boolean flag=true;
        while(!stack1.isEmpty() || !stack2.isEmpty() )
        {
            List<Integer> tempans=new ArrayList<>();
            if(flag==true)
            {
                while(!stack1.isEmpty())
                {
                TreeNode node=stack1.pop();
                tempans.add(node.val);
                if(node.left!=null)
                    stack2.push(node.left);
                if(node.right!=null)
                    stack2.push(node.right);
                }
                flag=false;
            }
            
            else if(flag==false)
            {
                 while(!stack2.isEmpty())
            {
                  TreeNode node=stack2.pop();
                tempans.add(node.val);
                if(node.right!=null)
                    stack1.push(node.right);
                if(node.left!=null)
                    stack1.push(node.left);
                
            }
                flag=true;
                
            }
           
            ans.add(tempans);
        }
        return ans;
        
        
    }
}