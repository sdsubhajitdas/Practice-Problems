// https://www.interviewbit.com/problems/inorder-traversal/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    26/01/2021
*/

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

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode current = root;
        while (current != null) {
            stack.push(current);
            current = current.left;
        }


        while (!stack.empty()){
            current = stack.pop();
            
            result.add(current.val);
            current = current.right;
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
        }

        return result;
    }
}
