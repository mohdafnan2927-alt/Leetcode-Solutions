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
     ArrayList<Integer> ans = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        inorder(root);
        for(int i =0;i<ans.size()-1;i++){
            if(ans.get(i)>=ans.get(i+1)){
                return false;
            }
        }
        return true;
    }
   
    public ArrayList inorder(TreeNode root){
        if(root == null){
            return ans;
        }
        inorder(root.left);
        ans.add(root.val);
        inorder(root.right);
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna