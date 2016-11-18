/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Codec { 

	// Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serialHelper(root, sb);
        return sb.toString();
    }
    
    private void serialHelper(TreeNode node, StringBuilder sb) {
        if (node == null) {
			sb.append("null").append(",");
            return;
		}

		sb.append(node.val).append(",");

		serialHelper(node.left, sb);
		serialHelper(node.right, sb);
    }
    
    int index = 0;

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        index = 0;
        
        if (data.length() == 0 || data.equals("null,")) {
            return null;
        }
        
        char[] arr = data.toCharArray();
        int num = 0;
        
        String[] strArr = data.split(",");
        List<String> list = new ArrayList<String>(Arrays.asList(strArr));
        
        //List<String> list = parseStr(data);
        TreeNode root = new TreeNode(Integer.parseInt(list.get(0)));
        //System.out.println(list);
        return deserialHelper(list);
        
    }
    
    private TreeNode deserialHelper(List<String> list) {
        
        
        String str = list.get(index);
        
        if (str.equals("null")) {
            return null;
        }
        
        TreeNode node = new TreeNode(Integer.parseInt(str));
        index++;
        node.left = deserialHelper(list);
        index++;
        node.right = deserialHelper(list);
        
        return node;
    }
    
    //Self-produced parse function

    /*private List<String> parseStr(String data) {
        List<String> list = new ArrayList<>();
        
        char[] arr = data.toCharArray();
        int num = 0;
        
        for (int i = 0; i < data.length(); i++) {
            if (isNum(arr[i]) || arr[i] == '-') {
                int sign = 1;
                if (arr[i] == '-') {
                    sign = -1;
                    i++;
                }
                num = arr[i] - '0';
                while (i + 1 < arr.length && isNum(arr[i + 1])) {
                    num = num * 10 + (arr[i + 1] - '0');
                    i++;
                }

                list.add(sign * num + "");
            } else if (arr[i] == ',') {
                continue;
            } else if (arr[i] == 'n'){
                if (data.substring(i, i + 4).equals("null")) {
                    list.add("null");
                    i += 3;
                }
            }
        }
        
        return list;
    }*/
    
    private boolean isNum(char c) {
        if (c >= '0' && c <= '9') {
            return true;
        } else {
            return false;
        }
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
