// https://www.interviewbit.com/problems/diagonal-traversal/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    24/04/2021
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
    public ArrayList<Integer> solve(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if(root == null) return result;

        HashMap<Integer,ArrayList<Integer>> diagonalMap = new HashMap<>();

        this.findDiagonalHelper(root,0,diagonalMap);

        for(int key: diagonalMap.keySet()) {
            result.addAll(diagonalMap.get(key));
        }

        return result;
    }

    private void findDiagonalHelper(TreeNode node, int diagonalNumber, HashMap<Integer, ArrayList<Integer>> diagonalMap) {
        if(node == null) return;

        if(diagonalMap.containsKey(diagonalNumber)){
            diagonalMap.get(diagonalNumber).add(node.val);
        }
        else {
            ArrayList<Integer> nodes = new ArrayList<>();
            nodes.add(node.val);
            diagonalMap.put(diagonalNumber,nodes);
        }

        this.findDiagonalHelper(node.left, diagonalNumber+1, diagonalMap);
        this.findDiagonalHelper(node.right, diagonalNumber, diagonalMap);
    }
}

