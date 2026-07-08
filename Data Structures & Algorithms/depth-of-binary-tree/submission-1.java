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
        
        Stack<Pair<TreeNode , Integer>> stack = new Stack<>();

        stack.push(new Pair<>(root , 1));
        int res = 0 ;

        while(!stack.isEmpty()){

            Pair<TreeNode , Integer> curr = stack.pop();

            TreeNode node = curr.getKey();
            int depth = curr.getValue();

            if(node != null)
            {
                res = Math.max(res , depth);
                stack.push(new Pair<>(node.left , 1 + depth));
                stack.push(new Pair<> (node.right , 1 + depth));
            }
        }

        return res;
    }
}
