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
    public boolean isBalanced(TreeNode root) {
        
        boolean isBalance[]=new boolean[1];
        isBalance[0]=true;
         height(root,isBalance);
        return isBalance[0];
        
    }
    
    public int height(TreeNode root,boolean isBalance[])
    {
          if(root==null)
              return 0;
        int left=height(root.left,isBalance);
        int right=height(root.right,isBalance);
        if(Math.abs(left-right)>1)
            isBalance[0]=false;
        return Math.max(left,right)+1;
    }
}