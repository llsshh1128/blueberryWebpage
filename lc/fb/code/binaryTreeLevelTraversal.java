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
	public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        
        helper(root, 0, map);
        
        for (int level : map.keySet()) {
            List<Integer> list = map.get(level);
            res.add(list);
        }
        
        return res;
    }
    
    private void helper(TreeNode node, 
    	                int level, 
    	                HashMap<Integer, List<Integer>> map) {
        if (node == null) {
            return;
        }
        
        if (map.containsKey(level)) {
            List<Integer> list = map.get(level);
            list.add(node.val);
            map.put(level, list);
            
        } else {
            List<Integer> list = new ArrayList<>();
            list.add(node.val);
            map.put(level, list);
            
        }
        
        
        
        helper(node.left, level + 1, map);
        helper(node.right, level + 1, map);
    }
}