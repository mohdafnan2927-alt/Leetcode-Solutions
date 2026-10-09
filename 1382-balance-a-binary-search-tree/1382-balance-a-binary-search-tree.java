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
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        inorder(root,ans);
        return convertBST(ans,0,ans.size()-1);
    }
    public void inorder(TreeNode root,ArrayList<Integer> ans){
        if(root == null){
            return;
        }
        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);

    }
    public TreeNode convertBST(ArrayList<Integer> ans,int start,int end){
        if(start>end){
            return null;
        }
        int mid = (start + end)/2;
        TreeNode root = new TreeNode(ans.get(mid));
        root.left = convertBST(ans,start,mid-1);
        root.right = convertBST(ans,mid+1,end);
        return root;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna