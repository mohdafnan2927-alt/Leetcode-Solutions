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
        StringBuilder data = new StringBuilder();
        preorder(root,data);
        return data.toString();
    }
    public void preorder(TreeNode root,StringBuilder data){
        if(root == null){
            data.append("null,");
            return;
        }
        data.append(root.val).append(",");
        preorder(root.left,data);
        preorder(root.right,data);
    }

    // Decodes your encoded data to tree.
   
    int idx = -1;
    public TreeNode deserialize(String data) {
        String[] values = data.split(",");
        idx = -1;
        return helper(values);
    }
    public TreeNode helper(String values[]){
        idx++;
         if(values[idx].equals("null")){
            return null;
        }
        TreeNode newnode = new TreeNode(Integer.parseInt(values[idx]));
        newnode.left = helper(values);
        newnode.right =helper(values);
        return newnode;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna