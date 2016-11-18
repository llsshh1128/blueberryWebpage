/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Solution { 
	public TreeNode predecessorBST(TreeNode root, TreeNode p) {
        if (root == null)
            return null;

        if (root.val >= p.val) {
            return predecessorBST(root.left, p);
        } else {
            TreeNode right = predecessorBST(root.right, p);
            return (right != null) ? right : root;
        }
	}
}