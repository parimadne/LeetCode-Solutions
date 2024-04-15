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
    public int sumNumbers(TreeNode root) {
        return diff(root, 0);
    }
    
    private int diff(TreeNode node, int path) {
        if (node == null)
            return 0;
        
        path = path * 10 + node.val;
        
        if (node.left == null && node.right == null)
            return path;
        
        return diff(node.left, path) + diff(node.right, path);
    }
}