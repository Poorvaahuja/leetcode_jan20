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
    TreeNode head = null;

    public void flatten(TreeNode root) {
        if(root != null) traversal(root);
    }
    private void traversal(TreeNode node){
        if(node.right != null) traversal(node.right);
        if(node.left != null) traversal(node.left);
        node.left = null;
        node.right = head;
        head = node;
    }
}
