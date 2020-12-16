// https://leetcode.com/problems/validate-binary-search-tree/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    17/12/2020
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
    public boolean isValidBST(TreeNode root) {
        return this.isValidBSTHelper(root, null, null);
    }

    private boolean isValidBSTHelper(TreeNode root, Integer low, Integer high){
        if(root == null) return true;

        if((low!=null && root.val <= low) || (high!=null && root.val >= high)){
            return false;
        }

        return this.isValidBSTHelper(root.left, low, root.val) && this.isValidBSTHelper(root.right, root.val, high);
    }
}