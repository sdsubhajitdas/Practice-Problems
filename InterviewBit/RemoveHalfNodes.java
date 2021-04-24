// https://www.interviewbit.com/problems/remove-half-nodes/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    24/04/2021
*/

import java.util.*;

/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public TreeNode solve(TreeNode root) {
        if(root == null) return root;
        return this.removeHalfHelper(root);
    }

    private TreeNode removeHalfHelper(TreeNode node) {
        if(node == null) return node;
        if(node.left == null && node.right == null) return node;

        TreeNode leftNode = this.removeHalfHelper(node.left);
        TreeNode rightNode = this.removeHalfHelper(node.right);

        if(leftNode != null && rightNode != null) {
            node.left = leftNode;
            node.right = rightNode;
            return node;
        }

        return (leftNode == null) ? rightNode: leftNode;
    }
}
