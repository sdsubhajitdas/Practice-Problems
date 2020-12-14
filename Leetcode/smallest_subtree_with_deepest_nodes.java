// https://leetcode.com/problems/smallest-subtree-with-all-the-deepest-nodes/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    13/12/2020
*/

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
    private int maxDepth;
    private TreeNode result;
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        this.maxDepth = Integer.MIN_VALUE;
        this.result = null;

        this.findMaxDepth(0, root);

        return result;
    }

    private int findMaxDepth(int level, TreeNode root){
        if(root == null){
            return level-1;
        }

        int leftSubTree = this.findMaxDepth(level+1, root.left);
        int rightSubTree = this.findMaxDepth(level+1, root.right);

        if(leftSubTree == rightSubTree && leftSubTree >= this.maxDepth){
            this.maxDepth = leftSubTree;
            this.result = root;
        }
        return Math.max(leftSubTree, rightSubTree);
    }
}