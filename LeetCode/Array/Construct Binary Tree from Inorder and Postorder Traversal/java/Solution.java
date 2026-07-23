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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> map = new HashMap<>();

        // Step 1: Build a map of inorder values for O(1) lookup
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        // Step 2: Build the tree recursively
        return buildtree(postorder, 0, postorder.length - 1,
                         inorder, 0, inorder.length - 1, map);
    }

    private TreeNode buildtree(int[] postorder, int postStart, int postEnd,
                               int[] inorder, int inStart, int inEnd,
                               Map<Integer, Integer> map) {
        // Base case: no elements left
        if (postStart > postEnd || inStart > inEnd) return null;

        // Step 3: Last element in postorder is the root
        TreeNode root = new TreeNode(postorder[postEnd]);

        // Step 4: Find the root index in inorder to split left/right
        int inRoot = map.get(root.val);
        int numsLeft = inRoot - inStart;

        // Step 5: Build left and right subtrees
        root.left  = buildtree(postorder, postStart, postStart + numsLeft - 1,
                               inorder, inStart, inRoot - 1, map);

        root.right = buildtree(postorder, postStart + numsLeft, postEnd - 1,
                               inorder, inRoot + 1, inEnd, map);

        return root;
    }
}