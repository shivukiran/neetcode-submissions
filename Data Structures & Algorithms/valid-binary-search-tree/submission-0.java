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
    public boolean isValidBST(TreeNode root) {
        




        

        
        return check(root ,null , null);
    }

    public boolean check(TreeNode r , Integer mini , Integer maxi)
    {
        if( r == null)return true;

        if((mini != null && mini >= r.val) ||
        ( maxi != null && r.val >= maxi))
        return false;

        return check(r.left , mini , r.val) && check(r.right , r.val , maxi);
    }
}
