// https://www.interviewbit.com/problems/right-view-of-binary-tree/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    26/04/2021
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
    int maxLevel;
    public ArrayList<Integer> solve(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if(root == null) return result;

        maxLevel = -1;
        this.rightViewHelper(root, 0, result);

        return result;
    }

    private void rightViewHelper(TreeNode node, int level, ArrayList<Integer> result) {
        if(node == null) return ;

        if(level > maxLevel) {
            result.add(node.val);
            maxLevel = level;
        }

        this.rightViewHelper(node.right, level+1, result);
        this.rightViewHelper(node.left, level+1, result);
    }
}
