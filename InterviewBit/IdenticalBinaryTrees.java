// Link
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    12/04/2021
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
    public int isSameTree(TreeNode root1, TreeNode root2) {
        return (this.isSameTreeHelper(root1, root2)) ? 1 : 0;
    }

    private boolean isSameTreeHelper(TreeNode node1, TreeNode node2) {
        if(node1 == null && node2 == null) return true;

        if(node1 != null && node2 != null) {
            return (node1.val == node2.val) && 
                this.isSameTreeHelper(node1.left, node2.left) &&
                this.isSameTreeHelper(node1.right, node2.right);
        }

        return false;
    }
}
