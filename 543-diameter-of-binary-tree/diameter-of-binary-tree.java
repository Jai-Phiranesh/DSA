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
    public int check(TreeNode root, int[] diameter){
        if(root ==null){
            return 0;
        }

        int lh =  check(root.left,diameter);
        int rh =  check(root.right,diameter);
        diameter[0] = Math.max(lh+rh , diameter[0]);
        return 1+ Math.max(lh,rh);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1];
        check(root,diameter);
        return   diameter[0];
    }
}