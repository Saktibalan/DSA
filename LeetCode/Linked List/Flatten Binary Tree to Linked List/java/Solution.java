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
    public void flatten(TreeNode root) {
        if (root == null) return;
        TreeNode c = root;

        while (c != null) {
            if (c.left != null) {
                TreeNode temp = c.left;
                while (temp.right != null) {
                    temp = temp.right;
                }

                temp.right = c.right;

                c.right = c.left;
                c.left = null;
            }
            c = c.right; 
        }
    }
}