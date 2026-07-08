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
    public int maxDepth(TreeNode root) {
        
        return dfs(root);
    }

    public int dfs(TreeNode r )
    {
        if(r == null)
        {
            return 0;
        }

        int ldepth = dfs(r.left);
        int rdepth = dfs(r.right);

        return 1 + Math.max(ldepth , rdepth);
    }
}
