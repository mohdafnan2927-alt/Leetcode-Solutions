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
    static class Info {
        Boolean BST;

        int min;
        int max;
        int sum;

        Info(Boolean BST, int min, int max, int sum) {
            this.BST = BST;
            this.min = min;
            this.max = max;
            this.sum = sum;
        }
    }

   static int maxBST = 0;

public int maxSumBST(TreeNode root) {
    maxBST = 0;
    maxsumBST(root);
    return maxBST;
}

public Info maxsumBST(TreeNode root) {
    if (root == null) {
        return new Info(true, Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
    }

    Info leftinfo = maxsumBST(root.left);
    Info rightinfo = maxsumBST(root.right);

    int sum = leftinfo.sum + rightinfo.sum + root.val;
    int min = Math.min(root.val, Math.min(leftinfo.min, rightinfo.min));
    int max = Math.max(root.val, Math.max(leftinfo.max, rightinfo.max));

    if (root.val <= leftinfo.max || root.val >= rightinfo.min ||
            !leftinfo.BST || !rightinfo.BST) {
        return new Info(false, min, max, sum);
    }

    maxBST = Math.max(maxBST, sum);
    return new Info(true, min, max, sum);
}
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna