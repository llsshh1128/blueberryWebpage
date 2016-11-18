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
    public boolean validateBST(TreeNode root) {
		if (root == null) {
            return true;
        }
        
        return helper(root).isValid;
    }
    
    public info helper(TreeNode node) {
        if (node.left == null && node.right == null) {
            return new info(node.val, node.val, true);
        }
        
        info res = new info(node.val, node.val, false);
        
        boolean leftTree = false;
        boolean rightTree = false;
        
        if (node.left != null) {
            info record1 = helper(node.left);
            
            if (record1.isValid && record1.max < node.val) {
                leftTree = true;
                res.min = record1.min;
            } else {
                return new info(0,0,false);
            }
        }
        
        if (node.right != null) {
            info record2 = helper(node.right);
            
            if (record2.isValid && record2.min > node.val) {
                rightTree = true;
                res.max = record2.max;
            } else {
                return new info(0,0,false);
            }
        }
        
        res.isValid = true;
        
        return res;
        
        
    }
    
    public class info {
        boolean isValid;
        int max;
        int min;
        
        public info (int maxVal, int minVal, boolean valid) {
            this.max = maxVal;
            this.min = minVal;
            this.isValid = valid;
        }
    }
}