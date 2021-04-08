// https://www.interviewbit.com/problems/path-to-given-node/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    08/04/2021
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
    public ArrayList<Integer> solve(TreeNode root, int destination) {
        Stack<Integer> resultPath = new Stack<>();
        if(root != null) this.findPathHelper(root, destination, resultPath);
        return new ArrayList<>(resultPath);
    }

    private void findPathHelper(TreeNode node, int destination, Stack<Integer> path) {
        if(node.val == destination) {
            path.add(destination);
            return;
        }

        if(node.left != null) {
            path.add(node.val);
            this.findPathHelper(node.left, destination, path);
            if(path.peek() != destination) path.pop();
        }

        if(node.right != null) {
            path.add(node.val);
            this.findPathHelper(node.right, destination, path);
            if(path.peek() != destination) path.pop();
        }
    }
}
