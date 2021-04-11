// https://www.interviewbit.com/problems/sum-root-to-leaf-numbers/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    11/04/2021
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
    public int sumNumbers(TreeNode root) {
        if(root == null) return 0;
        ArrayList<Integer> pathNums = new ArrayList<Integer>();

        this.findLeafPaths(root, "", pathNums);

        return pathNums.stream().mapToInt(Integer::intValue).sum() % 1003;
    }

    private void findLeafPaths(TreeNode node, String currentPath, ArrayList<Integer> pathList) {
        currentPath += node.val;
        int temp = Integer.parseInt(currentPath)% 1003;

        if(node.left == null && node.right == null) {
            pathList.add(temp);
            return;
        }

        if(node.left != null) {
            this.findLeafPaths(node.left, Integer.toString(temp), pathList);
        }

        if(node.right != null) {
            this.findLeafPaths(node.right, Integer.toString(temp), pathList);
        }
    }
}
