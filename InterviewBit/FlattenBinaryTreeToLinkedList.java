// https://www.interviewbit.com/problems/flatten-binary-tree-to-linked-list/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    25/04/2021
*/

import java.util.*;

/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode flatten(TreeNode node) {
        if(node == null) return null;
        if(node.left == null && node.right == null) return node;

        TreeNode leftList = this.flatten(node.left);
        TreeNode rightList = this.flatten(node.right);

        if(leftList == null && rightList == null) return node;

        TreeNode rightNode = node.right, leftListEnd = leftList;
        node.right = leftList;
        
        while(leftListEnd != null && leftListEnd.right != null) leftListEnd = leftListEnd.right;

        if(leftListEnd != null)
            leftListEnd.right = rightNode;
        else 
            node.right = rightList;

        node.left = null;
        return node;
    }
}

