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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
          
            List<List<Integer>> ans=new ArrayList<>();
        
              if(root==null)
                  return ans;
        
           Queue<TreeNode> que=new LinkedList<>();
        
            que.add(root);
        
             while(!que.isEmpty())
             {
                 int size=que.size(); 
                 List<Integer> tempList=new ArrayList<>();
                   while(size>0)
                   {
                       TreeNode node=que.poll();
                       tempList.add(node.val);
                       if(node.left!=null)
                            que.add(node.left);
                       if(node.right!=null)
                           que.add(node.right);
                       
                       size--;
                   }
                 
                 ans.add(tempList);
             }
        
        return ans;
        
    }
}