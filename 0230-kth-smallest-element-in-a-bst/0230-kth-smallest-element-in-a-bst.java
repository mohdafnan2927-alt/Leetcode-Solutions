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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        inorder(root,ans);
        int kr =1;
        if(k>ans.size()){
            return 0;
        }
        int ansr=0;
        for(int i =0;i<ans.size();i++){
            if(k==kr){
               ansr = ans.get(i);
               break;
            }
            kr++;
        }
        return ansr;
    }
    public void inorder(TreeNode root,ArrayList<Integer> ans){
        if(root == null){
            return;
        }
        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna