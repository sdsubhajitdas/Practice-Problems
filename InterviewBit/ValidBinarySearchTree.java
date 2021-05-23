// https://www.interviewbit.com/problems/valid-binary-search-tree/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    23/05/2021
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
    public int isValidBST(TreeNode root) {

        return (this.isValidBSTHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE)) ? 1 : 0;

    }

    private boolean isValidBSTHelper(TreeNode node, int low, int high) {
        if(node == null) return true;
        
        if((node.val <= low) || (node.val >= high)) return false;

        return this.isValidBSTHelper(node.left, low, node.val) && isValidBSTHelper(node.right, node.val, high);
    }
}


// 11 4 2 5 1 5 -1 -1 -1 -1 -1 -1

//         4
//     2       5
// 1       5