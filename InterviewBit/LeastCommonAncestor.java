// https://www.interviewbit.com/problems/least-common-ancestor/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    23/04/2021
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
    boolean found1, found2;
    public int lca(TreeNode root, int n1, int n2) {
        if(root == null) return -1;

        found1 = false;
        found2 = false;

        TreeNode node = this.lcaHelper(root, n1, n2);

        return (found1 && found2) ? node.val: -1;
    }

    private TreeNode lcaHelper(TreeNode node, int n1, int n2) {
        if(node == null) return null;

        TreeNode temp = null;
        if(node.val == n1) {
            found1 = true;
            temp = node;
        }
        if(node.val == n2) {
            found2 = true;
            temp = node;
        }

        TreeNode leftSubTree = this.lcaHelper(node.left, n1, n2);
        TreeNode rightSubTree = this.lcaHelper(node.right, n1, n2);

        if(temp != null) return temp;

        if(leftSubTree != null && rightSubTree != null) return node;

        return (leftSubTree != null) ? leftSubTree : rightSubTree;
    }
}

