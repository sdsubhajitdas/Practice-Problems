// https://www.interviewbit.com/problems/root-to-leaf-paths-with-sum/
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
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sumKey) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        this.pathSumHelper(root, 0, sumKey, new Stack<Integer>(), result);

        return result;
    }

    private void pathSumHelper(TreeNode node, int currentSum , int sumKey, Stack<Integer> currentPath, ArrayList<ArrayList<Integer>> resultPath) {
        currentPath.add(node.val);
        currentSum += node.val;
        
        if(node.left == null && node.right == null) {
            if(currentSum == sumKey) {
                ArrayList<Integer> path = new ArrayList<>(currentPath);
                resultPath.add(path);
            }
            currentPath.pop();
            return;
        }

        if(node.left != null) {
            this.pathSumHelper(node.left, currentSum, sumKey, currentPath, resultPath);
        }

        if(node.right != null) {
            this.pathSumHelper(node.right, currentSum, sumKey, currentPath, resultPath);
        }
        currentPath.pop();
    }
}

// 5 4 8 11 -1 13 4 7 2 5 1 -1 -1 -1 -1 -1 -1 -1 -1