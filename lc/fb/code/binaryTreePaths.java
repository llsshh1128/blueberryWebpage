public class Solution { 
	public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<String>();
        
        if (root == null) {
            return res;
        }
        
        helper(res, "", root);
        
        return res;
    }
    
    private void helper(List<String> res, String str, TreeNode node) {
        if (node.left == null && node.right == null) {
            str += "->" + node.val;
            str = str.substring(2);
            res.add(str);
            return;
        }
        
        str += "->" + node.val;
        
        if (node.left != null)
            helper(res, str, node.left);
            
        if (node.right != null)
            helper(res, str, node.right);
        
        
    }
}