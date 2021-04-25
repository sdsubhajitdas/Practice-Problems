// https://www.interviewbit.com/problems/vertical-order-traversal-of-binary-tree/
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
    public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode root) {
        ArrayList<ArrayList<Integer>> resultOrder = new ArrayList<>();
        if(root == null) return resultOrder;

        TreeMap<Integer, ArrayList<Integer>> lineMap = new TreeMap<>();
        
        this.verticalOrderTraversalHelper(root, 0, lineMap);

        for(Map.Entry<Integer, ArrayList<Integer>> entry : lineMap.entrySet()) {
            // System.out.println(entry.getKey());
            resultOrder.add(entry.getValue());
        }

        return resultOrder;
    }

    private void verticalOrderTraversalHelper(TreeNode node, int verticalLineNumber, TreeMap<Integer, ArrayList<Integer>> lineMap) {
        Queue<Pair> queue = new LinkedList<>();

        queue.add(new Pair(node,0));

        while(!queue.isEmpty()) {
            Pair p = queue.poll();

            if(lineMap.containsKey(p.lineNumber)){
                lineMap.get(p.lineNumber).add(p.node.val);
            }
            else {
                ArrayList<Integer> nodesOnThisLine = new ArrayList<>();
                nodesOnThisLine.add(p.node.val);
                lineMap.put(p.lineNumber, nodesOnThisLine);
            }

            if(p.node.left != null)
                queue.add(new Pair(p.node.left, p.lineNumber-1));
            if(p.node.right != null)
                queue.add(new Pair(p.node.right, p.lineNumber+1));

        }
    }

    private class Pair {
        TreeNode node;
        int lineNumber;
        Pair(TreeNode node, int lineNumber) {
            this.node = node;
            this.lineNumber = lineNumber;
        }
    }
}