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
	public TreeNode successorBST(TreeNode root, TreeNode p) {
        if (root == null)
            return null;

        if (root.val <= p.val) {
            return successorBST(root.right, p);
        } else {
            TreeNode left = successorBST(root.left, p);
            return (left != null) ? left : root;
        }
	}
}