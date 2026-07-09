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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

            return dfs(root , subRoot);
    }

    public boolean dfs(TreeNode r , TreeNode sR)
    {
        if(r == null) return false;


        if(sameTree(r , sR))return true;

        return dfs(r.left , sR) || dfs(r.right , sR);
        
    }

    public boolean sameTree(TreeNode r , TreeNode sR){

        if(r == null && sR == null)return true;
        if(r == null || sR == null)return false;

        if(r.val != sR.val)return false;
        return sameTree(r.left , sR.left) && sameTree(r.right, sR.right);
        
    }
}
