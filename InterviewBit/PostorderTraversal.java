// https://www.interviewbit.com/problems/postorder-traversal/
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
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> resultPostorder = new ArrayList<>();
        this.postorderTraversalHelper(root, resultPostorder);
    }

    private void postorderTraversalHelper(TreeNode node, ArrayList<Integer> order) { 
        if(node == null) return;
        if(node.left == null && node.right == null) {
            order.add(node.val);
            return;
        }

        this.postorderTraversalHelper(node.left, order);
        this.postorderTraversalHelper(node.right, order);
        order.add(node.val);
    }
}
