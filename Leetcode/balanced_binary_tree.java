// https://leetcode.com/problems/balanced-binary-tree/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    01/12/2020
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
    public boolean isBalanced(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)){
            return true;
        }

        return isBalancedHelper(root) != Integer.MIN_VALUE;
        
    }

    private int isBalancedHelper(TreeNode node){
        if(node == null){
            return -1;
        }
         int heightLeft = isBalancedHelper(node.left);
         int heightRight = isBalancedHelper(node.right);
         
         if(Math.abs(heightLeft-heightRight)>1 || heightLeft == Integer.MIN_VALUE || heightRight == Integer.MIN_VALUE){
             return Integer.MIN_VALUE;
         }

         return Math.max(heightLeft,heightRight) + 1;
    }
}