// https://www.interviewbit.com/problems/min-depth-of-binary-tree/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    10/04/2021
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
    public int minDepth(TreeNode root) {
        if(root == null) return 0;

        if(root.left == null && root.right == null) return 1;

        if(root.left == null) return this.minDepth(root.right) + 1;

        if(root.right == null) return this.minDepth(root.left) + 1;

        return 1 + Math.min(this.minDepth(root.left), this.minDepth(root.right));
    }
}
