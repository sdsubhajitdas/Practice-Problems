// https://leetcode.com/problems/increasing-order-search-tree/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    07/12/2020
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.ArrayList;

class Solution {
    public TreeNode increasingBST(TreeNode root) {
        if(root == null) return null;
        if(root.left == null && root.right == null) return root;

        ArrayList<Integer> array = new ArrayList<Integer>();
        inOrderTraversal(root, array);

        return makeNewTree(array);
    }

    private TreeNode makeNewTree(ArrayList<Integer> nodeValues){
        TreeNode returnHead = null, pointerNode = null;

        for(int value: nodeValues){
            TreeNode node = new TreeNode(value);
            if(returnHead == null){
                returnHead = node;
                pointerNode = returnHead;
            }
            pointerNode.right = node;
            pointerNode = pointerNode.right;
        }
        return returnHead;
    }

    private void inOrderTraversal(TreeNode node, ArrayList<Integer> array){
        if(node == null) return ;

        this.inOrderTraversal(node.left, array);
        array.add(node.val);
        this.inOrderTraversal(node.right, array);
    }
}