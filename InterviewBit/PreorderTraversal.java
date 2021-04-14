// https://www.interviewbit.com/problems/preorder-traversal/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    13/04/2021
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
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> resultPreorder = new ArrayList<>();
        if(root == null) return resultPreorder;

        Stack<TreeNode> stack = new Stack<TreeNode>();

        TreeNode current = root;

        while(current != null || !stack.isEmpty()) {

            while(current != null) {
                resultPreorder.add(current.val);
                if(current.right != null) stack.push(current.right);
                current = current.left;
            }

            if(!stack.isEmpty()) {
                current = stack.pop();
            }
        }
        return resultPreorder;
    }
}
