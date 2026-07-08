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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        

        Stack<TreeNode[]> stack = new Stack<>();

        stack.push(new TreeNode[]{p , q});

        while(!stack.isEmpty())
        {
            TreeNode[] node = stack.pop();
            TreeNode n1 = node[0] , n2 = node[1];

            if(n1 == null && n2 == null)continue;
            if(n1 == null || n2 == null || n1.val != n2.val)
            {
                return false;
            }

        stack.push(new TreeNode[]{n1.right , n2.right});
        stack.push(new TreeNode[]{n1.left , n2.left});
        }

        return true;
    }
}
