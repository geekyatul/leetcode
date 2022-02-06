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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
             int currentSum=0;
        boolean isTrue[]=new boolean[1];
        isTrue[0]=false;
           helper(root,targetSum,currentSum,isTrue);
        return isTrue[0];
        
    }
    
    public void helper(TreeNode root,int targetSum,int currentSum,boolean isTrue[])
    {
        if(root==null)
            return;
        
        if(root.left==null && root.right==null)
        {
            currentSum+=root.val;
            System.out.println(currentSum);
            if(currentSum==targetSum)
            {
                isTrue[0]=true;
                System.out.println("YEs I am ");
            }
                
            currentSum-=root.val;
            return;
        }
            currentSum+=root.val;
            helper(root.left,targetSum,currentSum,isTrue);
            helper(root.right,targetSum,currentSum,isTrue);
            currentSum-=root.val;
    
            
        
        
    }
}