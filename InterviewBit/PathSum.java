// https://www.interviewbit.com/problems/path-sum/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    09/04/2021
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
    public int hasPathSum(TreeNode root, int sumKey) {
        if(root == null) return 0;

        return this.hasPathSumHelper(root, 0, sumKey) ? 1 : 0;
    }

    private boolean hasPathSumHelper(TreeNode node , int sumTillNow, int sumKey) {
        sumTillNow += node.val;
        // Base condition
        if(node.left == null && node.right == null) {
            return (sumTillNow == sumKey) ? true: false;
        }

        boolean leftResult = false, rightResult = false;

        if(node.left != null) {
            leftResult = this.hasPathSumHelper(node.left, sumTillNow, sumKey);
        }

        if(node.right != null) {
            rightResult = this.hasPathSumHelper(node.right, sumTillNow, sumKey);
        }

        return leftResult || rightResult;
    }
}
