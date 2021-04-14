// https://www.interviewbit.com/problems/symmetric-binary-tree/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    14/04/2021
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
    public int isSymmetric(TreeNode root) {
        return (this.isSymmetricHelper(root, root)) ? 1 : 0;
    }

    private boolean isSymmetricHelper(TreeNode node1 , TreeNode node2) {
        if(node1 == null && node2 == null) return true;
        if(node1 == null || node2 == null) return false;

        return (node1.val == node2.val) && 
            this.isSymmetricHelper(node1.left, node2.right) &&
            this.isSymmetricHelper(node1.right, node2.left);
    }
}
